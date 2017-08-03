import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Catalog booksFile = new Catalog();
        File books = new File("books.txt");
        int selection;
        ArrayList<libraryItem> booksList = new ArrayList<libraryItem>();
        ArrayList<libraryItem> list = Catalog.readFromFile(books, booksList);
        ArrayList<libraryItem> onShelf = Catalog.displayOnShelf(list);
        ArrayList<libraryItem> checkedOut = Catalog.displayCheckedOut(list);
        System.out.println("WELCOME TO THE LIBRARY!");
        do {

            System.out.println();
            System.out.println("1) VIEW ALL BOOKS");
            System.out.println("2) VIEW BOOKS IN STOCK");
            System.out.println("3) VIEW CHECKED OUT BOOKS");
            System.out.println("4) CHECK OUT A BOOK");
            System.out.println("5) RETURN A BOOK");
            System.out.println("6) QUIT");
            selection = scan.nextInt();
            if (selection == 1) {
                for (int i = 1; i <= list.size(); i++) {
                    System.out.print(i + ": ");
                    System.out.println(list.get(i - 1));
                }
            } else if
                    (selection == 2) {
                int counter = 1;
                for (libraryItem libraryitem : onShelf) {

                    System.out.println(counter + ": " + libraryitem);
                    counter++;
                }
            } else if
                    (selection == 3) {
                for (libraryItem libraryitem : checkedOut) {
                    System.out.println(libraryitem);
                }
            } else if (selection == 4) {
                int sel;
                for (int i = 1; i <= onShelf.size(); i++) {
                    System.out.print(i + ": ");
                    System.out.println(onShelf.get(i - 1));
                }
                sel = scan.nextInt();
                libraryItem l = onShelf.get((sel - 1));
                l.checkOut();
                l.setDueDate();
                onShelf.remove(l);


                System.out.println("That's due back in 2 weeks, kid. Don't play with my books, ok?");
            } else if (selection == 5) {
                int sel;
                for (int i = 1; i <= checkedOut.size(); i++) {
                    System.out.print(i + ": ");
                    System.out.println(checkedOut.get(i - 1));
                }
                sel = scan.nextInt();
                libraryItem l = checkedOut.get((sel - 1));
                l.placeOnShelf();
                l.resetDueDate();
                checkedOut.remove(l);
                System.out.println("Thanks for returning your book!");

                onShelf.add(l);
            } else if (selection == 6) {
                break;
            }

            else {
                System.out.println("ERROR. ENTER 1-6.");
            }
//            Catalog.writeToFile(list, books);
        } while (selection != 6);

        System.out.println("Peace!");

    }
}
