public class Cau2_2 {
    public static void main(String[] args) {
        // Đề bài : Viết phương thức truyền vào 1 chuỗi bất kỳ
        //Thực hiện:
        //Đếm và in ra index của các ký tự o trong chuỗi



        String chuoi = "Do Ngoc Hieu";
        char kytu = 'o';
        int count = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kytu){
                count ++;
            }
        }
        System.out.println("So lan xuat hien ky tu " + kytu + " trong chuoi la : " + count + " lan");
    }
}