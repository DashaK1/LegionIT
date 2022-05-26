package BooksStoreOOP;

public abstract class Book {

    String bookName;
    String authorName;
    int ID;
    double usdPrice;
    boolean isAvailable;
    String euro = "EUR";
    String rub = "RUB";

    public Book(String name, String authorName, int id, double price, boolean isAvailable){
        this.bookName=name;
        this.authorName=authorName;
        this.ID=id;
        this.usdPrice=price;
        this.isAvailable=isAvailable;

    }


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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getUsdPrice() {
        return usdPrice;
    }

    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public double convertPrice(String currency){
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
        double priceAfterConversions = usdPrice * rate;
        return priceAfterConversions;

    }


    public void printBookDetails(){
        System.out.println("***********");
        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + ID);
        System.out.println("Book price: " + usdPrice + " USD, " + convertPrice(euro) + " EUR, " + convertPrice(rub) + " RUB ");
        System.out.println("Book is available: " + isAvailable);
    }

}
