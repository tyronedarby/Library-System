package GroupProject2;

//import GroupProject2.WelcomeScreen;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        WelcomeScreen ws = new WelcomeScreen();
        Menu menu = new Menu();

        menu.MenuContent(ws.Content());

        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        //manager.AddNewBooks();

        Book book = new Book(manager);
        StoreBook storeBook = new StoreBook(book, "bookInfo.txt");
        /*
        System.out.println("\n");
        System.out.println(book.getBookDescription());
        System.out.println("\nStore information ? (y/n): ");
        String opt = sc.next();

        switch (opt){
            case "y":
                StoreBook storeBook = new StoreBook(book, "bookInfo.txt");
            case "n":
                break;
        }*/
    }
}