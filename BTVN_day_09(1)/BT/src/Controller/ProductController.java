package Controller;

import Model.Product;
import Service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private final ProductService productService =new ProductService();

    public void run(){

        Scanner scanner = new Scanner(System.in);

        boolean isContinue = true;
        int option = 0 ;

        while (isContinue){
            printMenu();

            System.out.println("Nhap lua chon : ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1: {
                    ArrayList<Product> products = productService.getProducts();
                    if (products.isEmpty()){
                        System.out.println("Khong co san pham nao trong danh sach ");
                    }else {
                        System.out.println("Danh sach cac san pham ");
                        productService.printInfo(products);
                    }
                    break;
                }

                case 2 :{
                    System.out.println("Nhap ten san pham :");
                    String name = scanner.nextLine();

                    ArrayList<Product> products = productService.findByName(name);
                    if (products.isEmpty()){
                        System.out.println("Khong co san pham " +name + " trong danh sach ");
                    }else {
                        System.out.println("San pham co ten " + name + " bao gom :");
                        productService.printInfo(products);
                    }
                    break;
                }

                case 3 : {
                    System.out.println("Nhap id cua san pham :");
                    int id = Integer.parseInt(scanner.nextLine());

                    Product product = productService.findById(id);
                    if (product == null){
                        System.out.println("Khong co san pham id = " + id);
                    }else {
                        System.out.println("San pham co id = " + id);
                        System.out.println(product);
                    }
                    break;
                }
                case 4 :{
                    System.out.println("Nhap id san pham ban muon xoa : ");
                    int id = Integer.parseInt(scanner.nextLine());

                    Product product = productService.deleteProduct(id);
                    if (product == null){
                        System.out.println("Khong co san pham phu hop voi id : " + id);
                    }else {
                        productService.deleteProduct(id);
                        System.out.println("Da xoa thanh cong san pham co id : " + id);
                    }
                    break;
                }
                case 5 : {
                    ArrayList<Product> products = productService.findByQuantity();
                    break;
                }
                case 6 : {
                    System.out.println("Nhap muc gia san pham : ");
                    int price = Integer.parseInt(scanner.nextLine());
                    ArrayList<Product> products = productService.findByPrice(price);
                    if (products == null){
                        System.out.println("Khong co san pham nao co muc gia " + price);
                    }else {
                        System.out.println("Cac san pham co muc gia phu hop :" );
                        productService.printInfo(products);
                    }
                    break;
                }
                case 7 : {
                    isContinue = false;
                    break;
                }
                default:{
                    System.out.println("Khong co lua chon nao phu hop ");
                }
            }
        }
    }
















    public void printMenu(){
        System.out.println("******* Quản Li San Pham *******");
        System.out.println("1. Xem danh sach san pham");
        System.out.println("2. Tim kiem san pham theo ten  ");
        System.out.println("3. Tim san pham theo id");
        System.out.println("4. Xoa san pham theo id");
        System.out.println("5. Tim cac san pham co so luong duoi 5");
        System.out.println("6.Tim san pham theo muc gia");

    }
}
