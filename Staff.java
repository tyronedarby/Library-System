package GroupProject2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;


public class Staff
{
    Scanner sc = new Scanner(System.in);
    protected int numOfDaysCanBeRented = 0;
    protected double dailyCost = 0.00;
    protected String title = "";
    protected int numOfPages = 0;
    protected String author = "";
    protected String bookCondition = "";
    protected String genre = "";
    protected String bookname = "";

    public Staff(){

    }

    public void setNumOfPages(int nP){
        numOfPages = nP;
    }
    public int getNumOfPages(){
        return numOfPages;
    }

    public int getNumOfDaysCanBeRented(){
        return numOfDaysCanBeRented;
    }

    public void setTitle(String t){
        title = t;
    }

    public String getTitle(){
        return title;
    }

    public double getDailyCost(){
        return dailyCost;
    }

    public String getAuthor(){
        return author;
    }

    public String getBookCondition(){
        return bookCondition;
    }

    public String getGenre(){
        return genre;
    }
    
    public void RentBook(){
        System.out.println("Enter a book name: ");
        bookname = sc.nextLine();
        System.out.println("Book Rented");
    }
    
    public void ReturnBook(){
        System.out.println("Enter a book name: ");
        bookname = sc.nextLine();
        System.out.println("Book Returned");
    }
    
    public void CollectFines(){
        System.out.println("Enter number of days: ");
        int days = sc.nextInt();
        
        if(days > numOfDaysCanBeRented){
            double fine = days-numOfDaysCanBeRented*dailyCost;
            System.out.println("The person should pay"+" $"+fine);
            System.out.println("Enter fine: $");
            Double collfine = sc.nextDouble();
        }
        else{
            System.out.println("No fine");
        }
    }
    
        int age = 0;
        String status = "";
        String fname = "";
        String IDnum = "";
        String lname = "";
        String DOB = "";
        
    public void AddUser() throws FileNotFoundException, IOException{
        System.out.print("Enter Id Number: ");
        IDnum = sc.nextLine();
        System.out.print("Enter First Name: ");
        fname = sc.nextLine();
        System.out.print("Enter Last Name: ");
        lname = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        
        System.out.print("Enter the Status of the user: ");
        status = sc.nextLine();
        System.out.print("Enter the Date of birth: ");
        DOB = sc.next();
        
        try { 
            FileWriter fileObject = new FileWriter("Users.txt",true); 
            fileObject.write(age + " "); 
            fileObject.write(fname + " "); 
            fileObject.write(lname + " ");
            fileObject.write(IDnum + " ");
            fileObject.write(DOB + " ");
            fileObject.write(status + " ");
            fileObject.write("\n"); 
            fileObject.close(); 
            System.out.println("The User Has been added sucessfully");
        } 
        catch (IOException e) { 
            System.err.println( "Error, user information could not be stored."); 
            e.printStackTrace(); 
        } 
    }
    
    public void Retrieve() throws FileNotFoundException { 
        Scanner in = new Scanner(System.in);
        //blank out attributes
        fname = "";
        IDnum = "";
        lname = "";
        age = 0;
        DOB = "";
        status = "";
        System.out.print("Enter ID Number: ");
        String IDNum = in.nextLine();
        String fn;
        String id;
        String ln;
        String dob;
        int AGE;
        String sat;
        Scanner fileInp = new Scanner(new File("Users.txt"));
        while (fileInp.hasNext()) {
            fn = fileInp.next();
            ln = fileInp.next();
            dob = fileInp.next();
            AGE=fileInp.nextInt();
            sat =fileInp.next();
            id = fileInp.next();
            if(id.equals(IDNum)) {
                fname = fn;
                lname = ln;
                DOB = dob;
                IDnum = id;
                age = AGE;
                status = sat;
                break; 
            }
        }
        fileInp.close();
        if (IDnum==null) {
            System.out.println("User not found.");
        }
    }
    
    public void Display() { 
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("User Id: " + IDnum); 
        System.out.println("Age: " + age); 
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Status: " + status);
    }


}

