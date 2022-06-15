package Service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Model.Account;
import Exception.NotFoundException;

import java.util.ArrayList;
import java.util.Locale;

public class AccountService extends Account {
    ArrayList<Account> accounts;

    public AccountService() {
        init();
    }

    public void init() {
        accounts = new ArrayList<>();
        accounts.add(new Account("Do Hieu", "hieu@gmail.com", "12345678"));
        accounts.add(new Account("Khanh Linh", "linh@gmail.com", "87654321"));
        accounts.add(new Account("Con Vuon", "Vuon@gmail.com", "dmconvuon"));
        accounts.add(new Account("sherry", "Sherry@gmail.com", "concho123"));
    }

    // Trả về danh sách tài khoản
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    // In ra thông tin tài khoản
    public void printInfo(ArrayList<Account> list) {
        for (Account account : list) {
            System.out.println(account);
        }
    }

    // Tìm kiếm email
    public Account findByEmail(String email) {
        for (Account a : accounts) {
            if (a.getEmail().toLowerCase().contains(email.toLowerCase())) {
                return a;
            }
        }
        return null;
    }

    // Tìm kiếm password
    public Account findByPassword(String password) {
        for (Account a : accounts) {
            if (a.getPassword().toLowerCase().contains(password.toLowerCase())) {
                return a;
            }
        }
        return null;
    }

    // Kiểm tra tài khoản
    public Account checkAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username : ");
        String userName = sc.nextLine();

        System.out.println("Nhap email : ");
        String email = sc.nextLine();

        System.out.println("Nhap mat khau : ");
        String password = sc.nextLine();

        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        String PASSWORD_PATTERN = "^[a-z0-9._-]{3,50}$";

        if (Pattern.matches(PASSWORD_PATTERN, password) == false || Pattern.matches(EMAIL_PATTERN, email) == false) {
            throw new NotFoundException("Tai khoan hoac mat khau khong hop le !");
        }
        System.out.println("Chuc mung ban da dang ki thanh cong !");
        Account account = new Account(userName,email,password);
        accounts.add(account);
        return account;
    }
}
