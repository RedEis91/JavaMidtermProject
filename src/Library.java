import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Library
{
    public static void main(String[] args)
    {


        String lastName;
        String title;
        String firstName;
        CheckedOut checkedOut;
        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
        localDate = localDate.plus(14, ChronoUnit.DAYS);
        String enume;


        Scanner scan = new Scanner(System.in);
        //int keepGoing;
        BooksFile booksFile = new BooksFile();
        File books = booksFile.books;
//        ArrayList<libraryItem> testList = booksFile.readFromFile(books);
//        int i = 1;
//        for (libraryItem book: testList) {
//
//            System.out.println(""+ i+ ": " + book);
//            i++;
//        }

        System.out.println("Please enter first name: ");
        firstName = scan.nextLine();

        System.out.println("Please enter last name: ");
        lastName = scan.nextLine();

        System.out.println("Please enter the title: ");
        title = scan.nextLine();

        System.out.println("Is this book checked out: ");
        enume = scan.nextLine();

        if(enume.contains("Y") || enume.contains("y"))
        {
            checkedOut = CheckedOut.YES;
        }
        else
        {
            checkedOut = CheckedOut.NO;
        }

            libraryItem it = new libraryItem(lastName, firstName, title, checkedOut, localDate);
        System.out.println("Your new book is: " + it);
        BooksFile.writeToFile(it, books);
    }
}
