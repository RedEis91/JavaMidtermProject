public class libraryItem
{

    private String authorLastName;
    private String authorFirstName;
    private String title;

    public libraryItem( String lastName, String firstName, String title)
    {

        authorLastName = lastName;
        authorFirstName = firstName;
        this.title = title;
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
