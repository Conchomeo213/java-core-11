import java.util.Random;

public class Cau3 {
    public static void main(String[] args) {
        // Đề bài: Viết chương trình sinh ra một số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không.
        //Phương thức kiểm tra số nguyên tố


        Random rd = new Random();


        int int_rd = rd.nextInt(100);
        System.out.println("So vua random la : " + int_rd);
        System.out.println("So nay co phai so nguyen to khong : " + isPrimeNumber(int_rd));
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
