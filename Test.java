import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        StockSystem cs = new StockSystem();
        System.out.println(" Please set the maximum value of the store and see all options: ");
        Scanner scanner = new Scanner(System.in);
        cs.setMaxCount(scanner.nextInt());
        Book[] book = new Book[cs.getMaxCount()];
        Newspaper[] n = new Newspaper[cs.getMaxCount()];


        Book b1 = new Book("The Little Prince", "001", 15,
                "Prosveta", "Antoine De Saint-Exupery",
                "January 1990 ", " 9787201077642");

        Book b2 = new Book("One of First Division", "002", 20,
                "Bulgarian History", "Georgi Georgiev", "August 1934", "9787560637877");

        Book b3 = new Book("Java Study Notes", "003", 30, "University Press",
                "H.H.H.", "March 2015", "9787302388982");

        Book b4 = new Book("Boris III", "004", 20,
                "Bulgarian History", "H.H.", "August 1993", "9787560637877");

        cs.saveBook(book, b1);
        cs.saveBook(book, b2);
        cs.saveBook(book, b3);
        cs.saveBook(book, b4);

        Newspaper n1 = new Newspaper("\"Maritsa\"", "001", 1,
                "Plovdiv publishing house", "123456");

        Newspaper n2 = new Newspaper("\"Borba\"", "002", 1, "Veliko Turnovo publishing house",
                "223344");

        Newspaper n3 = new Newspaper("\"Biznes poshta\"", "003", 1,
                "Stara Zagora publishing house", "335599");

        Newspaper n4 = new Newspaper("\"Dnevnik\"", "004", 2, "Sofia publishing house",
                "557733");

        cs.saveNewspaper(n, n1);
        cs.saveNewspaper(n, n2);
        cs.saveNewspaper(n, n3);
        cs.saveNewspaper(n, n4);

        System.out.println("Please select the following operation: please enter '1' for saving ");

        int chosenOptionByUser1 = scanner.nextInt();
        if (chosenOptionByUser1 == 1) {
            System.out.println("Please, select the type of save: 1.Book or 2.Newspaper");

            int chosenOptionByUser2 = scanner.nextInt();
            if (chosenOptionByUser2 == 1) {
                System.out.println("\"Please enter the saved content:\": ");
                Book b = new Book();
                b.setCommodityName(scanner.next());
                b.setId(scanner.next());
// off actions                b.setAuthor(scanner.next());
// off actions                 b.setDate(scanner.next());
// off actions                b.setISBN(scanner.next());
                cs.saveBook(book, b);
            } else if (chosenOptionByUser2 == 2) {
                cs.saveNewspaper(n, n1);
            } else {
                System.out.println("Please, enter the correct action!");
            }
        } else if (chosenOptionByUser1 == 2) {
            System.out.println(" Please, enter the product name or keyword to query");
            String string = scanner.next();
            cs.search(book, n, string);
        }
    }
}