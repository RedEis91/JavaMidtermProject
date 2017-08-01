import java.io.*;
import java.util.*;


public class Library
{
    public static void main(String[] args) {
        System.out.println("Did it work?");
        Scanner scan = new Scanner(System.in);
        //int keepGoing;
        BooksFile booksFile = new BooksFile();
        File books = booksFile.books;
        ArrayList<String> testList = booksFile.readFromFile(books);
        int i = 1;
        for (String book: testList) {

            System.out.println(""+ i+ ": " + book);
            i++;
        }
        System.out.println("It worked!");
    }
}
