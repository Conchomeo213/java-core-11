import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Chieu dai hinh chu nhat : ");
        int chieudai = Integer.parseInt(sc.nextLine());

        System.out.println("Chieu rong hinh chu nhat : ");
        int chieurong = Integer.parseInt(sc.nextLine());

        System.out.println( "Dien tich hinh chu nhat la : " + dientich(chieudai,chieurong) );


        System.out.println("Nhap ten :");
        String name = sc.nextLine();

        System.out.println("Nhap noi dang song va lam viec : ");
        String address = sc.nextLine();

        System.out.println("Gioi tinh :");
        String gender = sc.nextLine();

        System.out.println("Nhap tuoi ");
        String age = sc.nextLine();

        System.out.println("Xin chao cac ban, minh ten la " + name + ", nam nay minh " + age + "tuoi, gioi tinh " + gender +
                ". Hien tai minh dang song va  lam viec tai " + address );


    }
    public static int dientich(int chieudai, int chieurong ){
        return chieudai * chieurong ;
    }
}
