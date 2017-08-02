import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Library
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Catalog booksFile = new Catalog();
        File books = new File("books.txt");
        int selection;


        ArrayList<libraryItem> booksList = new ArrayList<libraryItem>();
        ArrayList<libraryItem> list = Catalog.readFromFile(books, booksList);
        ArrayList<libraryItem> onShelf = Catalog.displayOnShelf(list);
        ArrayList<libraryItem> checkedOut = Catalog.displayCheckedOut(list);
        System.out.println("WELCOME TO THE LIBRARY!");
        System.out.println("1) VIEW ALL BOOKS");
        System.out.println("2) VIEW BOOKS IN STOCK");
        System.out.println("3) VIEW CHECKED OUT BOOKS");
        selection = scan.nextInt();

            if (selection == 1) {
                for (libraryItem libraryitem: list) {
                    System.out.println(libraryitem);
                }
            }
                    else if
            (selection == 2) {for (libraryItem libraryitem: onShelf) {
                    System.out.println(libraryitem);
                }}
                     else if
            (selection == 3) {
                for (libraryItem libraryitem: checkedOut) {
                    System.out.println(libraryitem);
                } }
                else {
                    System.out.println("1 2 or 3 please");
            }


//        System.out.println("Books checked out " + checkedOut.size());
//        for (libraryItem item: checkedOut) {
//            System.out.println(item);
//        }

//        System.out.println("Return?");
//        String retu;
//        retu = scan.nextLine();
//        libraryItem ite = checkedOut.get(0);
//        ite.placeOnShelf(retu);
//        onShelf = Catalog.displayOnShelf(list);
//
//
//        Catalog.writeToFile(list, books);
//
//
//        System.out.println("Books on shelf " + onShelf.size());
//        for (libraryItem item: onShelf) {
//            System.out.println(item);
//        }



    }
    public List<libraryItem> getAll(List lis) {
        return new ArrayList<libraryItem>(lis);
    }
}
