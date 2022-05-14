import java.util.Locale;
import java.util.Scanner;
// Câu 1: Viết chương trình thực hiện công việc:
//
//Nhập vào từ bàn phím họ và tên bạn
//Thực hiện chuẩn hóa chuỗi vừa nhập (in hoa chữ cái đầu của họ và tên)
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten : ");
        String name = sc.nextLine();

        System.out.print("Co phai ten cua ban la : " +  chuanhoa(name));
    }
    public static String chuanhoa(String input) {
        String result = "";
        input = input.toLowerCase(Locale.ROOT); // Đầu vào viết thường hết
        String[] arr = input.split(" "); // Gọi mảng và tách các mảng của chuỗi đầu vào
        // Duyệt mảng bằng for each
        for (String s : arr) {
            // Viết hoa kí tự đầu + viết thường mỗi kí tự khác nhau + với dấu cách
            if (!s.equals("") && !s.equals(null)){
                result += String.valueOf(s.charAt(0)).toUpperCase(Locale.ROOT) + s.substring(1) + " ";
            }

        }
        if (!result.equals("") && !result.equals(null)) {
            result = result.substring(0, result.length() -1); // Loại bỏ dấu cách cuối cùng của chuỗi
        }
        return result;
    }

}
