import java.util.*;
import java.io.*;
public class Catalog
{
    //constructor for libraryItem list
    ArrayList<libraryItem> list = new ArrayList<libraryItem>();



    //method to add libraryItem to List
    public void addLibraryItem(String authorLastName, String authorFirstName, String bookTitle)
    {
        libraryItem a = new libraryItem(authorLastName, authorFirstName, bookTitle);
        list.add(a);
    }


    public static void writeToFile(Object input)
    {
        File books = new File("books.txt");
        try {
            PrintWriter p = new PrintWriter(new FileOutputStream(books, true));

            p.println(input);
            p.close();
        } catch (IOException e)
        {
            System.out.println("File not found!");
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public static String readFromFile()
    {
        File books = new File("books.txt");
        String output = " ";
        try {
            FileReader reader = new FileReader(books);

            BufferedReader bufReader = new BufferedReader(reader);

            String line = bufReader.readLine();

            while(line != null)
            {
                output = output + line + "/n";
                line = bufReader.readLine();
            }
            bufReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("File not found!");
        }
        return output;
    }
}
