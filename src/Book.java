public class Book {

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
     * Create a custom constructor that will take 3 args and defines the Book object
     * Define Book class fields as name, genre, totalPage
     */

    public static final String askBook = "Would you like to enter book info ? (Y/N)";
    public static final String askAnotherBook = "Would you like to enter another book ? (Y/N)";
    public static final String askNameOfTheBook = "What is name of the book ? ";
    public static final String askGenreOfTheBook = "What is genre of the book ? ";
    public static final String askThePages = "How many pages does book have ? ";


    public Book(String name, String genre, int totalPage) {
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }



    //Create 3 args custom constructor here
    //YOUR CODE HERE


    //Define instance variables here
    //YOUR CODE HERE
    public String name;
    public String genre;
    public int totalPage;


    public static Book createBook() {
        String bookName = ScannerHelper.getAString(askNameOfTheBook);
        String bookGenre = ScannerHelper.getAString(askGenreOfTheBook);
        int bookPage = ScannerHelper.getAnInt(askThePages);

        return new Book(bookName, bookGenre, bookPage);
    }
    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}


