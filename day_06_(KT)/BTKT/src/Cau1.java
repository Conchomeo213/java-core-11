public class Cau1 {
    // Đề bài : Viết phương thức thực hiện in ra các hình sau:
    //In ra màn hình hình vuông *

    public static void main(String[] args) {
        System.out.println(vehinh1("*"));
        System.out.println(vehinh1("*"));
        System.out.println(vehinh1("*"));
        System.out.println(vehinh1("*"));
    }
    public static String vehinh1(String word){
        String[] chu = new String[4]; // duyet mang
        for (int i = 0; i < 4; i++) {
            chu[i]=word;

        }
        return String.join(" ",chu);

    }
}
