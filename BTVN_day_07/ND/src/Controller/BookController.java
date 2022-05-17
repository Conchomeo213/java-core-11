package Controller;

import Model.Book;
import Service.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController {
    private final BookService bookService = new BookService();

    public void run(){
        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;
        int option = 0;

        while (isContinue){
            printmenu();

            System.out.println("Nhap lua chon :");
            option = Integer.parseInt(sc.nextLine());

            switch (option){
                case 1 : {
                    for (Book book : bookService.getbook()){
                        System.out.println(book);
                    }

                }
                case 2 : {
                    System.out.print("Nhap ten sach ma ban muon tim : ");
                    bookService.findByTitle(sc.nextLine());
                    break;
                }

                case 3 : {
                    System.out.println("Tim kiem theo danh muc : ");
                    bookService.findBYCategory(sc.nextLine());
                    break;
                }
                case 4 : {
                    System.out.println("Nhap nam ban muon tim sach :");
                    bookService.findByPublishingOfthisYear(sc.nextInt());
                    break;
                }
                case 5 :{
                    isContinue = false;
                    break;
                }
                default:{
                    System.out.println("Lua chon khong phu hop ");
                    break;
                }

            }

        }
    }

    public void printmenu(){
        System.out.println("\\n*********** MENU ***********");
        System.out.println("1. Hien thi danh sach books");
        System.out.println("2. Tim sach theo ten ");
        System.out.println("3. Tim sach theo the loai ");
        System.out.println("4. Liet ke cac sach xuat ban nam nay ");
        System.out.println("5. Thoat\n ");
    }
}
