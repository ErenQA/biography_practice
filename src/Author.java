import java.util.ArrayList;

public class Author {
    public static final String askName = "What is your favourite author's first name ? ";
    public static final String askLastName = "What is your favourite author's last name ? ";
    public static final String askCountry = "Where is your favourite author from ? ";
    public static final String askIfAlive = "Is your favourite author alive ? (Y/N) ";
    public static final String askAge = "How old is your author ? ";
    public static ArrayList<Book> books = new ArrayList<>();

    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;

    }

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE


    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;


    public static Author createAuthor() {
        String authorsName = ScannerHelper.getAString(askName);
        String authorsLastName = ScannerHelper.getAString(askLastName);
        String authorsCountry = ScannerHelper.getAString(askCountry);
        String authorIsAliveOrNot = ScannerHelper.getAString(askIfAlive);

        int age = 0;
        boolean isAlive = false;

        if(authorIsAliveOrNot.equalsIgnoreCase("Y")) {
            isAlive = true;
            age = ScannerHelper.getAnInt(Author.askAge); }

        if(authorIsAliveOrNot.equalsIgnoreCase("N")) {
            isAlive = false;
        }
        ArrayList<Book> books = new ArrayList<>();

        do{
            String askBook = ScannerHelper.getAString(books.isEmpty() ? Book.askBook : Book.askAnotherBook);
            if(askBook.equalsIgnoreCase("N")) break;
            books.add(Book.createBook());

        }while(true);
        return new Author(authorsName, authorsLastName,authorsCountry,isAlive,age,books);

    }

    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", age=" + age +
                '}';
    }
}
