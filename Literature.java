
/**
 * Write a description of class Literature here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * @param dateAndYear Date and year published.
     * @param numberOfPages Number of pages in the newspaper.
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

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String getPublisher()
    {
        return this.publisher;
    }
    
    /**
     * Returns the name.
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

    public String getInfoAsString()
    {
        return getName() + getDate() + getNumberOfPages();
    }

    public String toString()
    {
        String returnString = name;
        returnString += "\nDate: " + date;
        returnString += "\nPages: " + numberOfPages;
        return returnString;
    }
}
