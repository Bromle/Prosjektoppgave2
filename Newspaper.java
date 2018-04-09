
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
                     int issueNumber, double price)
    {
        super(name, date, numberOfPages);
        setPrice(price);
        this.issueNumber = issueNumber;
    }

}
