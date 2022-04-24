public class Switch_case {
    public static void main(String[] args) {
        // Tiền đang có
        int money = 10000;

        // Menu
        switch (money){
            case 15000 :
            case 17000  :

            case 12000 : {
                System.out.println("ca phe sua");
                break;
            }
            case 10000 : {
                System.out.println(" ca phe da");
                break;
            }
            case 8000 : {
                System.out.println("Sting");
                break;
            }
            case 2000 : {
                System.out.println(" Tra da");
                break;
            }
            default: {
                System.out.println("Khong co do uong hop le");
                break;
            }
        }
    }
}
