import java.util.*;
import java.io.*;

public class Library
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the library!");
        Scanner scan = new Scanner(System.in);

        ArrayList<libraryItem> list = new ArrayList<libraryItem>();

        libraryItem book = new libraryItem("Harry Potter", "Rowling", "JK");
        list.add(book);

        System.out.println(list.get(0));
    }
}
