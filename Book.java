package GroupProject2; 

import java.util.Date;

public class Book {
    private String title;
    private String dateBookCreated;
    private String author;
    private String genre;
    private String bookDescription;
    private int maxRentedDays;
    private double dailyRentalCost;

    private Date date = new Date();

    public Book(Manager manager){
        setAuthor(manager.getAuthor());
        setTitle(manager.getTitle());
        setGenre(manager.getGenre());
        setDailyRentalCost(manager.getDailyCost());
        setMaxRentedDays(manager.getNumOfDaysCanBeRented());
        String days = date.getDate() + "/" + (date.getMonth()+1) + "/" + (date.getYear()+1900);
        setDateBookCreated(days);

        setBookDescription(
                getTitle()+":"
                +getAuthor()
                +getGenre() +getDateBookCreated()+"\n"
                +getDailyRentalCost()+getMaxRentedDays()+"\n");
    }

    public void setTitle(String Title) {
        this.title = Title;
    }

    public String getTitle() { return title; }

    public String getDateBookCreated() { return dateBookCreated; }

    public void setDateBookCreated(String dateBookCreated) {
        this.dateBookCreated = dateBookCreated;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String Genre) {
        genre = Genre;
    }

    public void setBookDescription(String BookDescription) {
        this.bookDescription = BookDescription;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public double getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(double DailyRentalCost) {
        this.dailyRentalCost = DailyRentalCost;
    }

    public int getMaxRentedDays() {
        return maxRentedDays;
    }

    public void setMaxRentedDays(int MaxRentedDays) {
        this.maxRentedDays = MaxRentedDays;
    }

}
