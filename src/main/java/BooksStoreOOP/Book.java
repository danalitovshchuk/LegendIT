package BooksStoreOOP;

public abstract class Book {
    String bookName;
    String authorName;
    int id;
    double USDPrice;
    boolean isAvailable;

    String euro = "EUR";
    String ruble = "RUB";

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUSDPrice() {
        return USDPrice;
    }

    public void setUSDPrice(double USDPrice) {
        this.USDPrice = USDPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Book (String name, String authorName, int id, double price, boolean isAvailable) {
        this.bookName = name;
        this.authorName = authorName;
        this.id = id;
        this.USDPrice = price;
        this.isAvailable = isAvailable;
    }

    public double convertPrice (String currency){
        double rate = 1;
        if(currency.equals(euro)){
            rate = 1.1;
        }
        else if (currency.equals(ruble)){
            rate = 70;
        }
        else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
        double priceAfterConversion = USDPrice * rate;
        return priceAfterConversion;
    }
public void printBookDetails (){
    System.out.println("*****");
    System.out.println("Book name is: " + bookName);
    System.out.println("Book id is: " + id);
    System.out.println("Book price: " + USDPrice + " USD, " + convertPrice(euro) +" EUR, " + convertPrice(ruble) + " RUB");
    System.out.println("Book is available: " + isAvailable);
}



}
