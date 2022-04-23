public class Main {

//    khai báo biến global

    public static int globalvariable = 20;

    public static void main(String[] args) {


//        Chướng trình đầu tiên
        System.out.println("Hello world");


//        Khai báo biến
        String firstName;
        String lastName;

//        Khởi tạo giá trị cho biến
        firstName = "Đỗ";
        lastName = "Hiếu";

//        In ra biến
        System.out.println(firstName);
        System.out.println(lastName);

//        Vừa khai báo biến vừa khởi tạo giá trị cho biến
//        String fullName = " Đỗ Hiếu";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int age = 25;
        System.out.println("Xin chào các bạn, tôi tên là " + fullName + ". Mình sinh năm"
                + (2022 - 25) + "và năm nay mình " + age + "tuổi");

//        Kiểu long
        Long money = 2_000_000_000L;
        System.out.println("Tài khoản không có gì ngoài tiền, chỉ có " + money + " tỷ thôi!!");

//        Kiểu boolean (đúng sai) true/false
        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried + " là chưa lấy vợ nhé.");
        System.out.println("isMarried = " + isMarried + " là mình đã lấy vợ nhé");

//        Khai báo biến kiểu động
        float weight = 60.5f;
        double height = 1.68;

        System.out.println("Cân nặng = " + weight);
        System.out.println("Chiều cao " + height);

//        Kiểu kí tự :  char --> search ASCII trên google;
        char charA = 'A';
        char chara = 97;

        System.out.println(charA);
        System.out.println(chara);
        //    Ép kiểu ngầm định : từ giá trị nhỏ --> lớn ( trình biên dịch tự biết và thực hiện)
        int number = 10;
        long number1 = number;
        double number2 = number;

        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);


//  Ép kiểu tường mình : Từ giá trị lớn --> nhỏ  (tự làm )
        double heightValue = 1.8;
        int heightValueConvert = (int) heightValue;
        System.out.println(heightValueConvert);
// Phạm vi của biến
        {
            int localVariable = 10;
            System.out.println(localVariable);
        }
        System.out.println(globalvariable);

    }
}
