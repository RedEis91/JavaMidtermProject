import java.time.LocalDate;
import java.util.*;
import java.io.*;
public class Catalog
{
    //constructor for libraryItem list // catalog
    ArrayList<libraryItem> list = new ArrayList<libraryItem>();


    //method to add libraryItem to List
    public void addLibraryItem(String authorLastName, String authorFirstName, String bookTitle, CheckedOut check, LocalDate date)
    {
        libraryItem a = new libraryItem(authorLastName, authorFirstName, bookTitle, check, date);
        list.add(a);
    }


}
