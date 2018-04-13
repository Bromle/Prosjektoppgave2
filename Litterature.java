
/**
 * Write a description of class Litterature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Litterature
{
    private final String name;
    private final String date;
    private final int numberOfPages;
    private double price;

    /**
     * Constructor for objects of class Litterature
     * @param name The litterature name.
     * @param dateAndYear Date and year published.
     * @param numberOfPages Number of pages in the newspaper.
     */
    public Litterature(String name, String date, int numberOfPages)
    {
        this.name = name;
        this.date = date;
        this.numberOfPages = numberOfPages;
        this.price = 0;
    }

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }
    
    /**
     * Returns the name.
     * @returns name The name of the Litterature.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Return date.
     * @return date The Litterature date.
     */
    public String getDate()
    {
        return this.date;
    }

    /**
     * Return number of pages of the Litterature.
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
