
/**
 * Write a description of class Newspaper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Newspaper extends Litterature
{
    private final int issueNumber;
    private final String publisher;
    /**
     * Constructor for objects of class Newspaper
     */
    public Newspaper(String name, String date, int numberOfPages, int issueNumber,
    String publisher)
    {
        super(name, date, numberOfPages);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public Newspaper(String name, String date, int numberOfPages, 
    int issueNumber, String publisher, double price)
    {
        super(name, date, numberOfPages);
        setPrice(price);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public String toString()
    {
        String returnString = super.getName();
        returnString += "\nDate: " + super.getDate();
        returnString += "\nNumber of pages: " + super.getNumberOfPages();
        returnString += "\nPrice: " + super.getPrice;
        returnString += "\nIssuenumber: " + issueNumber;
        returnString += "\nPublisher: " + publisher;
    }
}
