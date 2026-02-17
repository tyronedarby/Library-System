package GroupProject2;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    // instance variables - replace the example below with your own
    
    private Staff staff;
    private Manager manager;
    private Scanner sc = new Scanner(System.in);
    private WelcomeScreen ws = new WelcomeScreen();

    /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {
        
    }
    
    public void MenuContent(String status) throws FileNotFoundException, IOException{
        
        if (status == "c"){
            System.out.println("\n1. Return book");
            System.out.println("\n2. Add user");
            System.out.println("\n3. Edit user info");
            System.out.println("\n4. Collect fines");
            System.out.println("\n5. Rent book to user");
            System.out.println("\nSelect using the number corresponding to the option: ");

            int option = sc.nextInt();
            Clerk clerk = new Clerk();
            switch (option){
                case 1:
                    System.out.println("\nBook Return");
                    clerk.ReturnBook();
                case 2:
                    System.out.println("\nAdd user");
                    clerk.AddUser();
                    break;
                case 3:
                    System.out.println("\nEdit user info");
                case 4:
                    System.out.println("\nCollect fines");
                    clerk.CollectFines();
                    break;
                case 5:
                    System.out.println("\nRent book to user");
                    clerk.RentBook();
                default:
                    System.out.println("Invalid Input!");
            }
        }

        else if (status == "m"){
            System.out.println("\n\n1. Add new book");
            System.out.println("\n2. Edit book info");
            System.out.println("\n3. Remove damaged book");
            System.out.println("\n4. Return book");
            System.out.println("\n5. Add user");
            System.out.println("\n6. Edit user info");
            System.out.println("\n7. Collect fines");
            System.out.println("\n8. Rent book to user");
            System.out.println("\nSelect using the number corresponding to the option: ");

            int opt = sc.nextInt();
            manager = new Manager();
            switch (opt){
                case 1:
                    System.out.println("\nAdd new book\n");
                    manager.AddNewBooks();
                    break;
                case 2:
                    System.out.println("\nEdit book info");
                case 3:
                    System.out.println("\nRemove damaged book");
                    manager.deleteBook();
                    break;
                case 4:
                    System.out.println("\nBook Return");
                    manager.ReturnBook();
                case 5:
                    System.out.println("\nAdd user");
                    manager.AddUser();
                    break;
                case 6:
                    System.out.println("\nEdit user info");
                    manager.Retrieve();
                    manager.Display();
                    break;
                case 7:
                    System.out.println("\nCollect fines");
                    manager.CollectFines();
                    break;
                case 8:
                    System.out.println("\nRent book to user");
                    manager.RentBook();
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }


    }
    
}
