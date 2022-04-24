import java.lang.reflect.Method;
import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        // Bài 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhap chieu cao :");
//        double height = Double.parseDouble(sc.nextLine());
//
//        System.out.println("Nhap can nang : ");
//        double weight = Double.parseDouble(sc.nextLine());
//
//
//        System.out.println("BMI cua ban la :" + tinhBMI(height, weight));
//        double BMI = tinhBMI(height,weight);
//        if (BMI < 18.5){
//            System.out.println("Thieu can");
//        } else if ( BMI > 18.5 && BMI <= 24.9 ){
//            System.out.println("Binh Thuong");
//        } else {
//            System.out.println("Thua can");
//        }

        // Bài 2
     int mark = 70;
     if (mark >= 85){
         System.out.println("A");
     }
     else if (70 <= mark && mark < 85){
         System.out.println("B");
     }
     else if (40 <= mark && mark <70){
         System.out.println("C");

     }
     else {
         System.out.println("D");
     }




    }
    public static double tinhBMI( double height, double weight){
        return weight / (height * height );
    }

}
