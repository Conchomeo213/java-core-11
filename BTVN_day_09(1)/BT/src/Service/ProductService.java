package Service;

import Model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class ProductService {
    private ArrayList<Product> products;

    public ProductService(){
        init();
    }
    private void init(){
        products = new ArrayList<>();
        products.add(new Product(1,"Milk","Cho vao tu de uong ngon hon",3,10_000));
        products.add(new Product(2,"Hot Milk","Dun nong ",4,11_000));
        products.add(new Product(3,"Cake","Cho vao lo nuong song de nuong chin banh",5,15_000));
        products.add(new Product(4,"Soft Cake","Giu am banh",6,16_000));
        products.add(new Product(5,"Candy","Thuc pham chu yeu danh cho tre em ",10,20_000));
        products.add(new Product(6,"Rice","Cho vao noi com de nau chin",15,25_000));
        products.add(new Product(7,"Ice Cream","Cho vao tu lanh",20,12_000));
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
    // In ra danh sách sản phẩm
    public void printInfo(ArrayList<Product> list){
        for (Product product:list) {
            System.out.println(product);
        }
    }

    // Tìm kiếm sản phẩm theo tên : có thể có nhiều tên
    public ArrayList<Product>findByName (String name){
        ArrayList<Product>list = new ArrayList<>();
        for (Product p:products) {
            if (p.getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase())){
                list.add(p);
            }
        }
        return list;
    }
    // Tìm kiếm theo id
    public Product findById(int id){
        Scanner sc = new Scanner(System.in);
        for (Product p:products) {
            if (p.getId()== id){

                return p;
            }
        }
        return null;
    }
    // Xóa sản phẩm theo id
    public Product deleteProduct(int id){
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if (product.getId() == id){
                iterator.remove();
            }
        }
        return null;
    }


    // Tìm kiếm các sản phẩm có số lượng dưới 5
    public ArrayList<Product>findByQuantity(){
        ArrayList<Product> list =new ArrayList<>();
        for (Product p:products) {
            if (p.getQuantity() < 5){
                System.out.println("Cac san pham co so luong duoi 5 la : \n" + list.add(p));
            }
        }
        return list;
    }
    // Tìm kiếm sản phẩm theo mức giá
    public ArrayList<Product> findByPrice(int price){
        ArrayList<Product>list =new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() <50_000){
                System.out.println("Cac san pham co gia duoi 50000 la : \n" + list.add(p));
            }
            else if (p.getPrice()> 50_000 && p.getPrice()<= 100_000){
                System.out.println("Cac san pham co gia tren 50000 duoi 100000 la : \n" + list.add(p));
            }else if (p.getPrice()>100_000){
                System.out.println("Cac san pham co gia tren 100000 la : \n" + list.add(p));
            }
        }
        return list;
    }

}
