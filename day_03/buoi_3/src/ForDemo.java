import java.util.Random;
import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        //Thục hiện công việc "Thức dậy lúc 7h " trong vòng 30 ngày
//        for (int day = 1; day <= 30; day++ ){
//            System.out.println("Ngay " + day + " Thuc day luc 7h");
//        }

//      Thục hiện công việc "Thức dậy lúc 7h " vào những ngày lẻ, ngày chẵn bỏ qua
//        for (int day = 1; day <= 30; day ++){
//            if (day % 2 == 1){
//                System.out.println("ngay" + day + "thuc day luc 7h");
//            }
//        int day;
//        for (day = 1; day <= 30; day += 2) ;
//        System.out.println("ngay" + day + "thuc day luc 7h");


        //break
//        for (int day = 1; 1<=30;day++){
//            if (day==20){
//                System.out.println("Chan qua, khong thuc hien nua");
//                break;
//            }
//            System.out.println("ngay" + day + "thuc day luc 7h");
// Khi chua bat dau thi so tien dang co là 0k
   int money = 0;
   for (int day = 1; day <= 10; day++) {
       // money =money +100_100;
       money += 100_000;
   }
        System.out.println("So tien tiet kiem duoc la :" + money);


       // Random n số ngẫu nhiên trong khoảng từ 0 --> 100 .Nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println(" Ban muon Random bao nhieu so :");
        int count = sc.nextInt();


        for (int i = 0; i < count; i++) {
            int numberRandom = rd.nextInt(101);
            if (numberRandom >90 ){
                break;
            }

            System.out.print("\t" + numberRandom);
        }

        }



    }



    // continue: Nghi xa hoi vao nhung ngay cuoi tuan
//        for (int day=1 ; day <= 30 ; day++){
//        if (day % 7 ==0){
//            System.out.println("Nghi xa hoi ngu nuong");
//            continue;
//        }
//        System.out.println("ngay" + day + "thuc day luc 7h");
// Tính tổng tiền tiết kiệm
    // Trong vòng 10 ngày, mỗi ngày tiết kiệm 100k ==> 1000k












