public class Newspaper extends Stock {
    private String ISRC;

    public Newspaper(){
    }

    public Newspaper(String ISRC) {
        this.ISRC = ISRC;
    }

    public Newspaper(String commodityName, String id, double price, String publisher, String ISRC) {
        super(commodityName, id, price, publisher);
        this.ISRC = ISRC;
    }

    public String getISRC() {
        return ISRC;
    }

    public void setISRC(String ISRC) {
        this.ISRC = ISRC;
    }

    @Override
    public String toString() {
        return "Newspaper:  Newspaper name: " + getCommodityName()
                + ", Newspaper number: " + getId()
                + ", price: " + getPrice() +  ".";
    }
}
