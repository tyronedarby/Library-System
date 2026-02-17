package GroupProject2;

import java.util.Scanner;

/**
 * Write a description of class Login here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Login
{
    private String option;
    private Scanner sc = new Scanner(System.in);
    private String username;
    public Login(String opt)
    {
        option = opt;
    }

    public void LoginContent(){
        System.out.println("Enter username: ");
        username = sc.next();
        
    }
}
