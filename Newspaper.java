
/**
 * Store details of a newspaper.
 *
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (09.04.2018)
 */
public class Newspaper extends Literature
{
    private final int issueNumber;
    /**
     * Constructor for objects of class Newspaper
     * @param name The newspapers name.
     * @param date Date it is published.
     * @param publisher the publisher of the newpaper 
     * @param numberOfPages Number of pages in the newspaper.
     * @param issueNumber The number of the paper. 
     */
    public Newspaper(String name, String date, String publisher,
                     int numberOfPages, int issueNumber)
    {
        super(name, date,  publisher, numberOfPages);
        this.issueNumber = issueNumber;
    }

    /**
     * Constructor for objects of class Newspaper
     * @param name The newspapers name.
     * @param date Date it is published.
     * @param publisher the publisher of the newpaper 
     * @param numberOfPages Number of pages in the newspaper.
     * @param issueNumber The number of the paper. 
     * @param price the price of the newspaper
     */
    public Newspaper(String name, String date,String publisher,
                     int numberOfPages, int issueNumber,  double price)
    {
        super(name, date, publisher, numberOfPages);
        setPrice(price);
        this.issueNumber = issueNumber;
    }

     /**
     * Return the literature data 
     * @return the literature data
     */
    public String getData()
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
