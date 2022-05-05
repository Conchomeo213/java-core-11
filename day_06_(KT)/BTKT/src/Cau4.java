public class Cau4 {
    public static void main(String[] args) {
        // Đề bài: Viết chương trình thực hiện:
        //Liệt kê 10 số nguyên tố đầu tiên


        System.out.println("10 so nguyen to dau tien la : " );
        for (int i = 0; i < 35; i++) {
            if (isPrimeNumber(i)){
                System.out.print( i + ";");
            }
        }
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
