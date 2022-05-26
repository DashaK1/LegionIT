public class Book {
    // describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR Price of book
    // using conversion rate, calculate RUB Price of book
    // print all the books details including prices

        String euro = "EUR";
        String rub = "RUB";


    public static void main(String[] args) {
        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J. K. Rowling", 1, 10.5, false);
        book1.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20, true);
    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {

        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInRUB = calculatePrice(priceInUSD, rub);



        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + " EUR, " + priceInRUB + " RUB ");
        System.out.println("Book is available: " + isAvailable);

    }


    public double calculatePrice(double priceInUSD, String currency){
        double rate = 1;
        if (currency.equals(euro)){
            rate = 1.1;
        }
        else if (currency.equals(rub)){
            rate = 70;
        }
        else {
            System.out.println("Error: unknown currency, USD price will be returned ");
        }
        double priceAfterConversions = priceInUSD * rate;
        return priceAfterConversions;

    }

}