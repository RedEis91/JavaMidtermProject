import java.time.LocalDate;
import java.util.*;
import java.io.*;
public class Catalog
{
    //constructor for libraryItem list // catalog


    public static ArrayList<libraryItem> readFromFile(File books) {
        ArrayList<libraryItem> list = new ArrayList<libraryItem>();
        //FileReader always needs to be wrapped in Try/Catch.
        try {
            // to use buffered reader, you have to instantiate a reader first
            FileReader reader = new FileReader(books);
            //BufferedReader (more specific file reader) has method called readLine() to read data stream line by line
            BufferedReader bufReader = new BufferedReader(reader);
            String line = bufReader.readLine();
            //ensure the line being fed into bufReader isn't null
            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine(); // read the next line
            }
            bufReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }
        return list;
    }


    //method to add libraryItem to List
//    public void addLibraryItem(String authorLastName, String authorFirstName, String bookTitle, CheckedOut check, LocalDate date)
//    {
//        libraryItem a = new libraryItem(authorLastName, authorFirstName, bookTitle, check, date);
//        list.add(a);
//    }


}
