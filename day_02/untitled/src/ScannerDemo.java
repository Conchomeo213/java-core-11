import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        Khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);


        System.out.println("Nhap ten : ");
        String name = sc.nextLine();

        System.out.println("Nhap que quan :");
        String address = sc.nextLine();

        System.out.println("Nhap tuoi :");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap Email: ");
        String email = sc.nextLine();

        System.out.println("Toi ten la " + name + ".Nam nay toi " + age + " tuoi, que quan o " + address);


//        BMI
        System.out.println("Nhap can nang (kg) : ");
        double weight = sc.nextDouble();
        System.out.println("Nhap chieu cao (m) : ");
        double height = sc.nextDouble();
        System.out.println("voi weight = " + weight + " va height" + height +
                 "thi chi so BMI = " + calculateBMI(weight, height));



    }
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);

    }
}
