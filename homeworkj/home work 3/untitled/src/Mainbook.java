

import java.util.Scanner;

public class Mainbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book book = new book();

        System.out.print("1 ");
        book.id = sc.nextInt();
        sc.nextLine();

        System.out.print(" ");
        book.title = sc.nextLine();

        System.out.print("jack london ");
        book.author = sc.nextLine();

        System.out.print("333 ");
        book.pages = sc.nextInt();

        System.out.print("true/false ");
        book.isAvailable = sc.nextBoolean();

        System.out.println();
        book.bookInfo();

        System.out.println();
        book.isAvailableOrNot();

        sc.close();
    }
}