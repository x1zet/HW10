import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double priceBook = priceBook();
            addBook(name, pageCount,priceBook);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static double priceBook(){
        System.out.println("Введите цену книги");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0,0);
    }

    public static void addBook(String bookName, int pageCount, double priceBook) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр.\n"
                + "Цена книги: " + (priceBook > 0 ? priceBook : "не установлено") + " рублей\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
