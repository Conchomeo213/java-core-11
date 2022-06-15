package Controller;
import Exception.NotFoundException;
import Model.Account;
import Service.AccountService;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AccountController extends Account {
    private final AccountService accountService = new AccountService();

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option = 0;
        while (isContinue) {
            printMenu();
            System.out.println("Nhap lua chon : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 : {
                    System.out.println("Nhap email : ");
                    String account = sc.nextLine();
                    Account accounts = accountService.findByEmail(account);

                    System.out.println("Nhap mat khau :");
                    String password = sc.nextLine();
                    Account passwords = accountService.findByPassword(password);

                    if (accounts == null||passwords == null){
                        System.out.println("Tai khoan hoac mat khau khong hop le !");
                    }else {
                        System.out.println("Chao mung " +accounts.getUserName() + " da dang nhap thanh cong !");
                        boolean tieptuc = true;
                        int luachon = 0;
                        while (tieptuc) {
                            loginSuccessfully();
                            System.out.println("Nhap lua chon :");
                            luachon = Integer.parseInt(sc.nextLine());

                            switch (luachon) {
                                case 1: {
                                    System.out.println("Nhap username moi : ");
                                    String userName = sc.nextLine();
                                    accounts.setUserName(userName);
                                    System.out.println(accounts);
                                    break;
                                } case 2 :{
                                    System.out.println("Nhap email moi :");
                                    String email = sc.nextLine();
                                    if (accounts.getEmail().toLowerCase(Locale.ROOT).contains(email.toLowerCase(Locale.ROOT))){
                                        System.out.println("Email da bi trung !");
                                    }else {
                                        accounts.setEmail(email);
                                        System.out.println(accounts);
                                    }

                                }
                                case 3 : {
                                    System.out.println("Nhap mat khau moi :");
                                    String pass = sc.nextLine();
                                    accounts.setPassword(pass);
                                    System.out.println(accounts);
                                }
                                case 4 : {
                                    tieptuc = false;
                                    break;
                                }
                                default:{
                                    System.out.println("Khong co lua chon nao phu hop");
                                }
                            }
                        }
                    }
                   break;
                }
                case 3 : {
                    System.out.println("Nhap email :");
                    String email = sc.nextLine();
                    Account account = accountService.findByEmail(email);
                    if (account == null){
                        System.out.println("Tai Khoan nay khong ton tai. ");
                    }else {
                        System.out.println("Nhap mat khau moi :");
                        String pass = sc.nextLine();
                        account.setPassword(pass);
                        System.out.println(account);
                    }
                    break;
                }
                case 2 : {
                    Account account = accountService.checkAccount();
                    System.out.println(account);
                    break;
                }
            }
        }
    }
    public void loginSuccessfully() {
        System.out.println("1. Thay doi username");
        System.out.println("2. Thay doi email");
        System.out.println("3. Thay doi mat khau ");
        System.out.println("4. Dang xuat ");
        System.out.println("5. Thoat chuong trinh");
    }
    public void printMenu() {
        System.out.println("1. Dang nhap");
        System.out.println("2. Dang ki");
        System.out.println("3. Quen mat khau");
    }
}
