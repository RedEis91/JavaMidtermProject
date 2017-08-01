
public enum CheckedOut { YES, NO;

    @Override
    public String toString() {
        switch(this)
        {
            case YES:
                return "YES";
            case NO:
                return "NO";
            default:
                return "Check with your librarian";
        }
    }

}
