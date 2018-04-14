
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book extends Literature
{
    private final String author;
    /**
     * Constructor for objects of class Book
     */
    public Book(String name, String date, String publisher,
                      int numberOfPages, String author)
    {
        super(name, date,  publisher, numberOfPages);
        this.author = author;
    }

    public String getData()
    {
        String returnString = super.getName();
        returnString += "\nDate: " + super.getDate();
        returnString += "\nNumber of pages: " + super.getNumberOfPages();
        returnString += "\nPrice: " + super.getPrice();
        returnString += "\nIssuenumber: " + super.getPublisher();
        return returnString;
    }
}
