import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Library
{
    public static void main(String[] args)
    {
        BooksFile booksFile = new BooksFile();
        File books = booksFile.books;



        ArrayList<libraryItem> list = Catalog.readFromFile(books);
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
