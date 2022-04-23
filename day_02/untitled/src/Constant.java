public class Constant {
    public final int age = 30;

    public static void main(String[] args) {


//        Vừa khai báo vừa khởi tạo giá trị
        final String name = "yolo";
//      Khai báo hằng số nên viết hoa
        final String FIRST_NAME = "bob";
//        Khai báo trc khởi tạo gtri sau
        final double PI;
        PI = 3.14;

        System.out.println(name);
        System.out.println(PI);
        System.out.println(FIRST_NAME);

//        Thay đổi giá trị của hằng số
//        PI = 4; --> Không thể thực hiện gán lại giá trị
//        Tham chiếu biến global
//        System.out.println(age);
        Constant f = new Constant();
        System.out.println(f.age);

    }


}
