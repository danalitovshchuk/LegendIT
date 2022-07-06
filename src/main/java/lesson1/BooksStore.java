package lesson1;

import java.awt.print.Book;

public class BooksStore {
    //describe a book, create all the variables we need
    //name, author, id, price is USD, availability
    // using conversion rate, calculate EUR Price of the book
    // using conversion rate, calculate RUB Price of the book
    //print all the book details including prices
    public static void main(String[] args) {
        String bookName = "Harry Potter";
        String authorName = "J.K. Rowling";
        int id = 1;
        double priceInUSD = 10.5;
        boolean isAvailable = true;

    }

    public void createNewBook (String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){

        double rate = 1.1;
        double priceInEUR = priceInUSD * rate;


        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + " EUR");
        System.out.println("Book is available: " + isAvailable);

    }

}
