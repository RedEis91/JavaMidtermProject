
public enum CheckedOut { YES, NO;

    @Override
    public String toString() {
        switch(this)
        {
            case YES:
                return "Checked Out";
            case NO:
                return "On Shelf";
            default:
                return "Check with your librarian";
        }
    }

}
