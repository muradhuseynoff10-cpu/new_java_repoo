

public class book {
    int id;
    String title;
    String author;
    int pages;
    boolean isAvailable;


    void bookInfo() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
    }


    void isAvailableOrNot() {
        if (isAvailable) {
            System.out.println("стоить брать.");
        } else {
            System.out.println("не стоит брать.");
        }
    }
}
