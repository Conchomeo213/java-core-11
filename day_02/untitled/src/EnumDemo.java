
enum Role {
    ADMIN, USER, SALE, TEACHER
}

public class EnumDemo {



//    Khai bao enum trong noi bo class
    enum Gender {
        MALE, FEMALE
}
    public static void main(String[] args) {
        System.out.println(Gender.MALE);
        System.out.println( "Gioi tinh cua toi la " + Gender.FEMALE);
        System.out.println("Toi dang la " + Role.ADMIN + " Cua mot trang web");
        System.out.println("Thang 4 dang la " + Season.SUMMER);
    }
}
