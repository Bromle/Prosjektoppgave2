
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book extends Litterature
{
    private final String publisher;

    /**
     * Constructor for objects of class Book
     */
    public Book(String name, String date, int numberOfPages, String publisher)
    {
        super(name, date, numberOfPages);
        this.publisher = publisher;
    }

    public String toString()
    {
        String returnString = super.getName();
        returnString += "\nDate: " + super.getDate();
        returnString += "\nNumber of pages: " + super.getNumberOfPages();
        returnString += "\nPrice: " + super.getPrice;
        returnString += "\nIssuenumber: " + publisher;
    }
}
