import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.io.*;
public class Catalog
{

    public static ArrayList<libraryItem> readFromFile(File books, ArrayList a)
    {
//        String output = " ";
        try {
            //takes in file input stream
            FileReader reader = new FileReader(books);
            //filters that stream down further
            BufferedReader bufReader = new BufferedReader(reader);
            //line is stored as string
            String line = bufReader.readLine();
            //as long as line exists
//
            while(line != null)
            {
                //create a new String array by splitting line into tokens, separated by tabs
                String[] tokens = line.split("\t");

                //making sure there are 5 tokens
                  if (tokens.length < 5) {
                    System.out.println("Bad line format --halting read");
                    System.out.println(tokens.length + " is the length of your libraryItem");
                    //breaks out of loop but will still return carsList
                    break;
                }
                //instantiates new CheckedOut enum
                CheckedOut c;
                //conditional logic to check if CheckedOut is "YES" (contains the letter Y, ignoring case)
                if (tokens[3].contains("y") || tokens[3].contains("Y")) {
                    //if yes, CheckedOut.YES
                    c = CheckedOut.YES;
                    //otherwise, CheckedOut.NO
                } else {c= CheckedOut.NO;}
                LocalDate date = LocalDate.now(ZoneId.systemDefault());
                libraryItem item = new libraryItem(tokens[0], tokens[1], tokens[2], c,date);
                //adds libraryItem to arrayList
                a.add(item);
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
        return a;
    }


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

    public static ArrayList<libraryItem> displayOnShelf(ArrayList<libraryItem> list) {
        ArrayList<libraryItem> onShelf = new ArrayList<>();

        for (libraryItem item: list) {
            if (item.getCheckedOut() == CheckedOut.NO) {
                onShelf.add(item);

            }
        }
        return  onShelf;
    }

    public static ArrayList<libraryItem> displayCheckedOut(ArrayList<libraryItem> list) {
        ArrayList<libraryItem> checkedOut = new ArrayList<>();

        for (libraryItem item: list) {
            if (item.getCheckedOut() == CheckedOut.YES) {
                checkedOut.add(item);

            }
        }
        return  checkedOut;
    }




}
