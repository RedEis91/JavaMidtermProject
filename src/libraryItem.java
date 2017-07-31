
public class libraryItem
{
    private String title;
    private String authorLastName;
    private String authorFirstName;

    public libraryItem(String title, String lastName, String firstName)
    {
        this.title = title;
        authorLastName = lastName;
        authorFirstName = firstName;
    }

    public String getTitle() {
        return title;
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
