public class Main {
    public static void main(String[] args) {
           int a =  30 ;
           int b = 10 ;

//           Toán tử ++, --
//        c = a =>> c =30
        int c = a++;
        System.out.println(c);     //30
        System.out.println(a);    //31

        // a tăng lên 1 --> a =32
        // d = a = 32
        int d = ++a;
        System.out.println(d);  //32
        System.out.println(a); //32

        // b =10, a=32
        // b tăng lên 1 ==> b =11
        // e = 32
        int e = a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);

        int f = ++a + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);

//      vd &&
        boolean  coTien = true ;
        boolean troiDep =true;

        System.out.println(coTien && troiDep ); // true && true =>> true



        // Toán tử hoặc ||
        System.out.println( coTien || !troiDep); // false || false => false



        int number = 20;
//        number = number + 10 ; // 30
        number += 10;

        number -= 10; // number = number -10;







    }
}
