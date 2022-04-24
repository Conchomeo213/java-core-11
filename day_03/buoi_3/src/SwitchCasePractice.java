import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args) {
        int day = 2;


        switch (day){
            case 0 : {
                System.out.println("Chu Nhat");
                break;
            }
            case 1 : {
                System.out.println("Thu Hai");
                break;
            }
            case 2 : {
                System.out.println("Thu Ba");
                break;
            }
            case 3 : {
                System.out.println("Thu Tu");
                break;
            }
            case 4 : {
                System.out.println("Thu Nam");
                break;
            }
            case 5 : {
                System.out.println("Thu Sau");
                break;
            }
            case 6 : {
                System.out.println("Thu Bay");
            }
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int month = (int) Double.parseDouble(sc.nextLine());

        switch (month){
            case 1:
            case 2:
            case 3: {
                System.out.println("Mua xuan");
                break;
            }
            case 4:
            case 5:
            case 6: {
                System.out.println("Mua he ");
                break;
            }
            case 7:
            case 8:
            case 9: {
                System.out.println("Mua thu");
                break;
            }
            case 10:
            case 11:
            case 12: {
                System.out.println("Mua dong");
                break;
            }
        }

    }
}
