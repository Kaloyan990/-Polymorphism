public class Stock {

    private String commodityName;
    private String id;
    private double price;
    private String publisher;

    public Stock() {
    }

    public Stock(String commodityName, String id, double price, String publisher) {
        this.commodityName = commodityName;
        this.id = id;
        this.price = price;
        this.publisher = publisher;
    }


    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "Stock -" +
                "product name - " + commodityName + '\''  + id + '\'' + price  +
                '.';
    }
}
