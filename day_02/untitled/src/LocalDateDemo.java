import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateDemo {
    public static void main(String[] args) {
//        Lấy ngày hiện tại
        LocalDate Ld =LocalDate.now();
        System.out.println(Ld);

//        Chỉ định ngày tháng năm
        LocalDate Ld1 = LocalDate.of(2022, 9, 21);
        System.out.println(Ld1);
//        Lấy theo năm hiện tại
        System.out.println("Nam hien tai: " + Ld.getYear());
        System.out.println("Thang hien tai: " + Ld.getMonth());
        System.out.println(Ld.getDayOfWeek());

//        Thay đổi thời gian
        System.out.println(Ld.plusYears(2));
        System.out.println(Ld.minusMonths(2));

        System.out.println(Ld.getYear() + " co la nam nhuan khong: " + Ld.isLeapYear());
        System.out.println(Ld.plusYears(2).getYear() + " co la nam nhuan khong: " + Ld.plusYears(2).isLeapYear());

//      So sánh
        System.out.println(Ld.equals(Ld1));
        System.out.println(Ld.isBefore(Ld1));
        System.out.println(Ld.isAfter(Ld1));

//        Format định dạng
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        String strDate1 = Ld.format(formatter1);
//        Áp dụng format cho đối tượng ld

        System.out.println(strDate1);


    }
}
