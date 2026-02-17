package GroupProject2; 

import java.io.FileWriter;
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Manager extends Staff {

    private final RandomAccessFile randomAccessFile;

    public Manager() 
     throws FileNotFoundException{
        this.randomAccessFile = new RandomAccessFile("good.txt","rw");

    }
    
    public void AddNewBooks() throws FileNotFoundException{

        System.out.print("Enter the author of the book: ");
        author = sc.nextLine();
        System.out.print("Enter book title: ");
        title = sc.nextLine();
        System.out.print("Enter genre: ");
        genre = sc.nextLine();
        System.out.print("Enter the condition of the book: ");
        bookCondition = sc.nextLine();

        System.out.print("Enter number of pages: ");
        numOfPages = sc.nextInt();

        System.out.print("Enter the maximum number of days it can be rented? ");
        numOfDaysCanBeRented = sc.nextInt();

        System.out.print("Enter daily rental cost: ");
        dailyCost = sc.nextDouble();
        
        System.out.println("\nStore information ? (y/n): ");
        String opt = sc.next();

        //Book book = new Book();    
        //StoreBook storebook = new StoreBook(book, "C:\\Users\\Owner\\Documents\\Object-Oriented Programming\\CIT2004\\src\\GroupProject2\\bookInfo.txt");


    }
    
    public String addComma(String Author,String Title, String Genre,
                           String DateBookCreated, double DailyRentalCost,
                           int MaxRentedDays){
        return Author+","+Title+","+Genre+","+DateBookCreated+","+DailyRentalCost+","+MaxRentedDays;
    }
    
    public void addBookToLibrary(String info){
        try {
            RandomAccessFile store = new RandomAccessFile("good.txt", "rw");
            int pos = (int) store.length();
            store.seek(pos);
            store.writeBytes(info);
            store.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void ViewBooks(){
        int count = 1;
        try {
            RandomAccessFile store = new RandomAccessFile("good.txt", "r");
            Scanner scan = new Scanner(store.readLine());
            scan.useDelimiter("-");
            System.out.println("Author"+","+"Title"+","+"Genre"+","+"DateBookCreated"+","+"DailyRentalCost"+","+"MaxRentedDays");
            while(scan.hasNext()){
                System.out.println(count+"."+scan.next());
                count++;
            }

            store.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String getBook(){
        ViewBooks();
        int count = 0;
        int book = getInput();
        String books = null;
        try {
            RandomAccessFile store = new RandomAccessFile("good.txt", "r");
            Scanner scan = new Scanner(store.readLine());
            scan.useDelimiter("-");
            do{
                count++;
                books = scan.next();
            }while(scan.hasNext() && count!=book);

            store.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }   
    
    public int getInput(){
        Scanner scans = new Scanner(System.in);
        return scans.nextInt();
    }
    
    public String topLevelDelimiter(String bookinfo){
        return bookinfo+"-";
    }
    
     
    public void  deleteBook() 
    throws IOException {
    RandomAccessFile delete = new RandomAccessFile("bookInfo.txt", "rw");
    StoreBook sbook = null ;
    System.out.println("Enter the Title of the book you want to remove: ");
    String book = sc.nextLine();
    //Setting file pointer to start of file
    delete.seek(0);
    String data = delete.readLine();
    while (data != null ){
      String[] recordToBeSearched = data.split("\n");
      String record = recordToBeSearched[1];
      String[] booktitle = record.split(":");
      if(booktitle != null && booktitle.equals(book)){
        String blankData = new String();
        delete.writeBytes(blankData);
        break ;
       
      }
      else if(booktitle == null)
          System.out.println("File is empty");
      else if(booktitle.equals(book) == false)
          System.out.println("Book title not found");
     data = delete.readLine();
    }
  }

    
 
}
