import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

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

    public void setDueDate(LocalDate dueDate)
    {
        LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
        LocalDate returnDate = currentDate.plus(14, ChronoUnit.DAYS);
        dueDate = returnDate;

    }

    public String getTitle() {
        return title;
    }

    public CheckedOut getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(CheckedOut checkedOut) {
        this.checkedOut = checkedOut;
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
        return authorLastName + " " + authorFirstName + " " + title + " Checked Out: " + checkedOut + " Due Date: ";
    }
}
