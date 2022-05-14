import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(creatArray()));
    }
    public static int[] creatArray(){
        Scanner sc =new Scanner(System.in);
        // Nhập mảng
        System.out.println("Nhap so phan tu mang : ");
        int count =sc.nextInt();

        // Khởi tạo mảng và số phần tử = count
        int[] numberInput = new int[count];

        // Nhập vào phần tử mảng
        // Duyệt mảng
        for (int i = 0; i < numberInput.length; i++) {
            System.out.println("nhap so phan tu thu " +(i + 1) + ":");
            numberInput[i]=sc.nextInt();
            if (numberInput[i] % 2 == 0){
                numberInput[i] += 1;
            }
        }
        return numberInput;
    }
}
