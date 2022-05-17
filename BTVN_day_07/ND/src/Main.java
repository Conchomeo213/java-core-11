import Controller.BookController;
import Model.Book;
import Service.BookService;

public class Main {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }

}
