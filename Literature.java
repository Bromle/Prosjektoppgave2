
/**
 * A class representing shared characteristics of literature.
 *
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (09.04.2018
 */
public class Literature
{
    private final String name;
    private final String date;
    private final String publisher;
    private final int numberOfPages;
    private double price;

    /**
     * Constructor for objects of class Literature
     * @param name The literature name.
     * @param date Date the literature is published.
     * @param numberOfPages Number of pages.
     */
    public Literature(String name, String date, String publisher,
                      int numberOfPages)
    {
        this.name = name;
        this.date = date;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.price = 0;
    }
    
    /**
     * Sets the price of the literature 
     */
    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }
    
    /**
     * Return the price of the literature
     * @return the price of the literarure
     */
    public double getPrice()
    {
        return this.price;
    }

    /**
     * Return the publisher of the literature 
     * @return the publisher of the literature
     */
    public String getPublisher()
    {
        return this.publisher;
    }
    
    /**
     * Returns the name of the literature.
     * @returns name The name of the Literature.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Return date.
     * @return date The Literature date.
     */
    public String getDate()
    {
        return this.date;
    }

    /**
     * Return number of pages of the Literature.
     * @return numberOfPages The number of pages.
     */
    public int getNumberOfPages()
    {
        return this.numberOfPages;
    }
    
    /**
     * Return the information of name, date and number of pages
     * @return the information of name, date and number of pages
     */
    public String getInfoAsString()
    {
        return getName() + getDate() + getNumberOfPages();
    }

    /**
     * Return the literature data 
     * @return the literature data
     */
    public String getData()
    {
        String returnString = name;
        returnString += "\nDate: " + date;
        returnString += "\nPages: " + numberOfPages;
        return returnString;
    }
}
