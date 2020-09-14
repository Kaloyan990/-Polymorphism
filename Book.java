
public class Book extends Stock {

    private String author;
    private String date;
    private String ISBN;

    public Book() {
    }

    public Book(String commodityName, String id, double price, String publisher,
                String author, String date, String ISBN) {
        super(commodityName, id, price, publisher);
        this.author = author;
        this.date = date;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book:  book name: " + getCommodityName() + " " + ", book number: " + getId() + " " +
                ", price: " + getPrice() +  ".";
    }
}
