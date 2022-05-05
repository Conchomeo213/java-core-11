public class Cau1_2 {
    public static void main(String[] args) {
        // Đề bài: Viết phương thức thực hiện in ra các hình sau:
        //In ra màn hình hình tam giác *


        System.out.println(dong1("*"));


        System.out.println(dong2("*"));

        System.out.println(dong3("*"));

        System.out.println(dong4("*"));

    }
    public static String dong1(String word){
        String[] chu = new String[1];
        for (int i = 0; i < 1; i++) {
            chu[i] = word;
        }
        return String.join("",chu);
    }
    public static String dong2(String word2){
        String[] chu2 = new String[2];
        for (int a = 0; a < 2; a++) {
            chu2[a] = word2;
        }
        return String.join(" ",chu2);
    }
    public static String dong3(String word3){
        String[] chu3 = new String[3];
        for (int b = 0; b < 3; b++) {
            chu3[b]=word3;
        }
        return String.join(" ",chu3);
    }
    public static String dong4(String word4){
        String[] chu4 = new String[4];
        for (int c = 0; c < 4; c++) {
            chu4[c]= word4;
        }
        return String.join(" ",chu4 );
    }
}
