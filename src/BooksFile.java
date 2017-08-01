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

    public static ArrayList<libraryItem> readFromFile(File books)
    {
        ArrayList<libraryItem> booksList = new ArrayList<libraryItem>();
//        String output = " ";
        try {
            //takes in file input stream
            FileReader reader = new FileReader(books);
            //filters that stream down further
            BufferedReader bufReader = new BufferedReader(reader);
            //line is stored as string
            String line = bufReader.readLine();
            //as long as line exists
//            int parser = 0;
            while(line != null)
            {
                //create a new String array by splitting line into tokens, seperated by spaces
                String[] tokens = line.split(" ");

                libraryItem item = new libraryItem(tokens[0], tokens[1], tokens[2]);

                booksList.add(item);
//                output = output + line + "/n";
                line = bufReader.readLine();
//                parser++;
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
