package GroupProject2;
import java.util.Scanner;


public class WelcomeScreen
{
    // instance variables - replace the example below with your own
    private Scanner sc = new Scanner(System.in);
    private String opt;

    public WelcomeScreen()
    {
        
    }

    public String Content()
    {
       System.out.print("\tWelcome to the Book Management System");
       System.out.print("\n\nAre you the Clerk OR the Manager?(c/m)");
       
       opt = sc.nextLine();
       
       switch(opt){
           case "c":
               return "c";
           case "m":
               return "m";
           default:
                System.out.println("Invalid Input!");
       }
       return "";
    }

}
