package BooksStoreOOP;

public class BooksStoreMain {
    public static void main(String[] args) {
        AudioBook book1 = new AudioBook("Harry Potter", "J.K Rowling", 1, 10.5, false, "mp3", 128, "Smith");
        book1.printBookDetails();
        EBook book2 = new EBook("Anna Karenina", "L. Tolstoy", 2, 20, true, "https://www.books.com");
        book2.setUSDPrice(20);
        book2.printBookDetails();


//        book1.setAvailable(true);
//        book2.setUSDPrice(30);
//
//        book1.printBookDetails();
//        book2.printBookDetails();
    }

}
