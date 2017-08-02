import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Library
{
    public static void main(String[] args)
    {
        Catalog booksFile = new Catalog();
        File books = new File("books.txt");

        ArrayList<libraryItem> booksList = new ArrayList<libraryItem>();


       ArrayList<libraryItem> list = Catalog.readFromFile(books, booksList);


        ArrayList<libraryItem> onShelf = Catalog.displayOnShelf(list);
        ArrayList<libraryItem> checkedOut = Catalog.displayCheckedOut(list);

        System.out.println("Books on shelf " + onShelf.size());
        for (libraryItem item: onShelf) {
            System.out.println(item);
        }

        System.out.println("Books checked out " + checkedOut.size());
        for (libraryItem item: checkedOut) {
            System.out.println(item);
        }

//        String lastName;
//        String title;
//        String firstName;
//        CheckedOut checkedOut;
//        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
//        localDate = localDate.plus(14, ChronoUnit.DAYS);
//        String enume;
//
//
//        Scanner scan = new Scanner(System.in);
//        //int keepGoing;


    }
}
