import java.io.*;
import java.util.*;
public class BooksFile {
    File books = new File("books.txt");



    public static void writeToFile(Object input, File books)
    {
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

    public static ArrayList<String> readFromFile(File books)
    {
        ArrayList<String> booksList = new ArrayList<String>();
//        String output = " ";
        try {
            FileReader reader = new FileReader(books);

            BufferedReader bufReader = new BufferedReader(reader);

            String line = bufReader.readLine();

            while(line != null)
            {

                booksList.add(line);
//                output = output + line + "/n";
                line = bufReader.readLine();
            }
            bufReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("File not found!");
        }
        return booksList;

        //RETURN AN ARRAYLIST
    }
}
