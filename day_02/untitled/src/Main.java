import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        Khai báo theo kiểu literal (giá trị thể hiện chính nó )

        String name = "Do Hieu";
      String name1 = "Do Hieu";
//        Khởi tạo = từ khóa là new --> sinh ra đối tượng
        String message = new String("xin chao");
        String message1 = new String("xin chao");

        System.out.println(name);
        System.out.println(message);
//      == thường được sử dụng cho kiểu dữ liệu nguyên thủy
        System.out.println(name ==name1);
        System.out.println(message==message1);

//     equal so sánh về mặt ký tự
        System.out.println(name.equals(name1));
        System.out.println(message.equals(message1));

//        Method String
        String text ="Xin chao cac ban";

        System.out.println("In hoa chu : " + text.toUpperCase());
        System.out.println("In thuong chu :" + text.toUpperCase());

        System.out.println(" Do dai chuoi :" + text.length());
        System.out.println("Ky tu dau cua chuoi: " + text.charAt(0));

        System.out.println("Ky tu cuoi cung cua chuoi: " + text.charAt(text.length() - 1));
        System.out.println("Chuoi hi co chi so bat dau la : " + text.indexOf("hi"));
        System.out.println("Chuoi ch co chi so bat dau la :" + text.indexOf("ch"));
        System.out.println("chuoi hi co ton tai trong chuoi ban dau k? "  + text.contains("hi"));
        System.out.println("Chuoi ch co ton tai trong chuoi bat dau k? " + text.contains("ch"));
//        cắt chuoi lấy giá trị thứ tự từ 0,3
        System.out.println("Cat chuoi xin :" + text.substring(0,3));

        System.out.println("Cat chuoi xin chao cac ban : " + text.substring(4));
    }
}
