
/**
 * Write a description of class Newspaper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Newspaper extends Literature
{
    private final int issueNumber;
    /**
     * Constructor for objects of class Newspaper
     */
    public Newspaper(String name, String date, String publisher,
    int numberOfPages, int issueNumber)
    {
        super(name, date,  publisher, numberOfPages);
        this.issueNumber = issueNumber;
    }

    public Newspaper(String name, String date, int numberOfPages, 
    int issueNumber, String publisher, double price)
    {
        super(name, date, publisher, numberOfPages);
        setPrice(price);
        this.issueNumber = issueNumber;
    }

    public String toString()
    {
        String returnString = super.getName();
        returnString += "\nDate: " + super.getDate();
        returnString += "\nNumber of pages: " + super.getNumberOfPages();
        returnString += "\nPrice: " + super.getPrice();
        returnString += "\nIssuenumber: " + issueNumber;
        returnString += "\nPublisher: " + super.getPublisher();
        return returnString;
    }
}
