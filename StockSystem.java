public class StockSystem {
    private int currentCount;
    private int maxCount;

    public int getCurrentCount() {
        return currentCount;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public void saveBook(Book[] book, Book b) {
        if (currentCount < maxCount) {
            book[currentCount] = b;
            System.out.println(" save success! ");
            System.out.println(book[currentCount].toString());
            currentCount++;
        }
    }

    public void saveNewspaper(Newspaper[] newspaper, Newspaper n) {
        if (currentCount < maxCount) {
            newspaper[currentCount] = n;
            System.out.println(" save success! ");
            System.out.println(newspaper[currentCount].toString());
            currentCount++;
        }
    }

    public void search(Book[] book, Newspaper[] newspaper, String object) {
        for (int i = 0; i < 10; i++) {
            if (book[i].getCommodityName().contains(object)) {
                System.out.println(book[i].toString());
                break;
            } else if (newspaper[i].getCommodityName().contains(object)){
                System.out.println(newspaper[i].toString());
                break;
            }
        }
        System.out.println(" Check for this item ");
    }
}
