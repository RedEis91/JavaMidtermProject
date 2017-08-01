public class libraryItem
{

    private String authorLastName;
    private String authorFirstName;
    private String title;
    private CheckedOut checkedOut;

    public libraryItem( String lastName, String firstName, String title, CheckedOut checkedOut)
    {

        authorLastName = lastName;
        authorFirstName = firstName;
        this.title = title;
        this.checkedOut = checkedOut;
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
        return authorLastName + " " + authorFirstName + " " + title;
    }
}
