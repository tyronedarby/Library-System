 package GroupProject2;

import javax.swing.text.Style;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class StoreBook {

    public StoreBook(Book addThisBook, String FilePath){
        addToEndOfFile(addThisBook, FilePath);

    }

    //Initialize the File and the program
    public void createFIle(String FilePath){
        try {
            RandomAccessFile theFile = new RandomAccessFile(FilePath, "rw");
            System.out.println(FilePath + " is created/overridden");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
    }

    // Each Entity in the the Library Database is gonna have 250 characters
    // if the characters given is less than 250 we will add blank spaces to fill
    public String recordToAdd(Book book){
        String bookDesc = book.getBookDescription();
        if (bookDesc.length() < 250){
            int counts = 250-bookDesc.length();
            for(int i = 0; i<counts; i++){
                bookDesc  = (bookDesc + " ");
            }
            return bookDesc;
        }
        return bookDesc;
    }

    // to find the end of the file copy the contents of the file
// and use the .length() method to find the amount of character to seek to
    public int endOfFile(String FilePath){
        try {
            RandomAccessFile theFile = new RandomAccessFile(FilePath, "r");
            try {
                int FileContents = Math.toIntExact(theFile.length());
                try {
                    return FileContents;
                }
                catch (NullPointerException e){
                    return 0;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
        return 0;
    }

    //Add file to the end of the Library Database
    public void addToEndOfFile(Book addThisBook, String FilePath){
        String bookInfo = recordToAdd(addThisBook);
        int goToThisRecord = endOfFile(FilePath);
        try {
            RandomAccessFile Library = new RandomAccessFile(FilePath, "rw");
            try {
                Library.seek(goToThisRecord);

                Library.writeBytes(bookInfo);


            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
