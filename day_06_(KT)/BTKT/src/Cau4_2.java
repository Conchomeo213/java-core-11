public class Cau4_2 {
    public static void main(String[] args) {
        // Đề bài: Viết chương trình thực hiện:
        // Liệt kê các số nguyên tố nhỏ hơn 10



        System.out.println("Cac so nguyen to nho hon 10 :");
        for (int i = 0; i < 10; i++) {
            if (isPrimeNumber(i)){
                System.out.print(i + ";");
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
