package lesson2;

public class Book<list> {

    String euro = "EUR";
    String ruble = "RUB";

   public static void main(String[] args) {
      Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K Rowling", 1, 10.5, false);
       book1.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20, true);

    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){

        double priceInEUR = calculatePrice(priceInUSD,euro);
        double priceInRUB = calculatePrice(priceInUSD,ruble);

        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR +" EUR, " + priceInRUB + " RUB");
        System.out.println("Book is available: " + isAvailable);


    }

    public double calculatePrice (double priceInUSD, String currency){
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
        double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;
    }

}



