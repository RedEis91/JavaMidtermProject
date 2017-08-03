import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.*;
import java.time.format.DateTimeFormatter;
public class libraryItem

{

    private String authorLastName;
    private String authorFirstName;
    private String title;
    private CheckedOut checkedOut;
    private LocalDate dueDate;

    public libraryItem( String lastName, String firstName, String title, CheckedOut checkedOut, LocalDate dueDate)
    {

        authorLastName = lastName;
        authorFirstName = firstName;
        this.title = title;
        this.checkedOut = checkedOut;
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate() {
        LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
        LocalDate returnDate = currentDate.plus(14, ChronoUnit.DAYS);
        dueDate = returnDate;
    }

    public void resetDueDate() {
        LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
        dueDate = currentDate;
    }


    public String getTitle() {
        return title;
    }

    public CheckedOut getCheckedOut() {
        return checkedOut;
    }

//    public CheckedOut setCheckedOut() {
//        this.checkedOut = checkedOut;
//        return this.checkedOut;
//    }

    public void placeOnShelf() {
        checkedOut = CheckedOut.NO;
    }

    public void checkOut() {
        checkedOut = CheckedOut.YES;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }



    @Override
    public String toString()
    {

        String results = " ";
    System.out.printf("%-14s %-13s %-42s %-13s",authorLastName ,authorFirstName ,title ,checkedOut);

        return results;
    }
}
