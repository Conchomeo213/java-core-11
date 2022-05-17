package Service;

import Model.Book;

import java.time.LocalDate;

public class BookService {
    public Book[] getbook(){
        Book[] books = {
                new Book(1,"Những người khốn khổ", "Bùi Hiên", "tiểu thuyết", "Kim Đồng", 2019),
                new Book(2, "Đắc nhân tâm", "Tô Hoài", "trinh thám", "Tuổi trẻ", 2022),
                new Book(3, "Deep work", "Thu Hằng", "kỹ năng sống", "Phụ nữ", 2021),
                new Book(4, "Rèn luyện tư duy phản biện", "Minh Duy", "tiểu thuyết", "Kim Đồng", 2022),
                new Book(5, "Nghìn lẻ một đêm", "Minh Trí", "trinh thám", "Phụ nữ", 2019),
        };
        return books;
    }

    public void findByTitle(String title){
        int count = 0;
        for (Book book:getbook()) {
            if (book.title.contains(title)){
                count++;
                System.out.println(book);
            }
            if (count == 0){
                System.out.println("Khong co sach phu hop voi ten la : " + title);
            }
            break;
        }
    }
    public void findBYCategory (String category ){
        int count =0;
        for (Book book:getbook()) {
            if (book.cagegory.contains(category)){
                count++;
                System.out.println(book);
            }
            if (count == 0){
                System.out.println("Khong co sach phu hop voi category : " + category);
            }
            break;
        }
    }
    public void findByPublishingOfthisYear(int year){
        int currentYear = LocalDate.now().getYear();
        int count = 0;
        for (Book book:getbook()) {
            if (book.year == currentYear){
                count++;
                System.out.println(book);
            }
            if (count == 0){
                System.out.println("Khong co sach nao xuat ban trong nam :" + year );
            }
            break;
        }
    }
}
