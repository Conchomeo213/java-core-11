import java.sql.SQLOutput;

public class Method {
    public static void main(String[] args) {
        Method m = new Method();
        m.sayHello();
//        Argument : Đối số
        m.sayHelloName("Do Hieu");
//        Argument
        m.sayHelloName("nguyen van a");

        int data = m.sum(10, 20 );
        System.out.println(data);

        int data1 = m.sum(data, 70);
        System.out.println(data1);

        System.out.println(m.sum(3, 4));

    }


    public void sayHello() {
         System.out.println("Xin chao cac ban");
    }
    public void sayHelloName(String name){
        System.out.println("Xin chao " + name);
    }
    public int sum(int a, int b){
//        int data = a + b;
//        return data;

        return a + b;

    }
}
