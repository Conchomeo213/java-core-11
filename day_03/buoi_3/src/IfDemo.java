public class IfDemo {
    public static void main(String[] args) {
        int hour = 20;

//        Câu lệnh if
        if (hour < 10)  {
            System.out.println("good morning!");
        }
//      Câu lệnh if else
        if (hour < 12) {
            System.out.println("Good morning!");
        }
        else {
            System.out.println("Good afternoon!");
        }

        String message = hour < 12 ?"Good morning!" :"Good afternoon!";
        System.out.println("message" + message );

//        Câu lệnh if /else  if /else
        if (hour < 12){
        System.out.println("good morning");}
        else if ( hour >= 12 && hour <= 18){
            System.out.println("Good afternoon");}
        else {
            System.out.println("Good evening");
        }

//        Câu lệnh if /else if/else lồng nhau
        int number = -10;
        if (number > 0){
            System.out.println("số dương");
            if (number % 2 == 0){
                System.out.println("Số dương chẵn ");}
            else{
                System.out.println("Số lẻ");}

        }
        else if (number<0){
            System.out.println("Số âm");
        }
        else {
            System.out.println("Số không ");
            }

        }

    }

