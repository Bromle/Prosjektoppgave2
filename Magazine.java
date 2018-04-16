
/**
 * Store details of a magazine.
 *
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (09.04.2018)
 */
public class Magazine extends Literature
{
    /**
     * Constructor for objects of class Magazine
     * @param name The magazine name.
     * @param date Date it is published.
     * @param publisher the publisher of the magazine 
     * @param numberOfPages Number of pages in the magazine. 
     */
    public Magazine(String name, String date, String publisher, int numberOfPages)
    {
        super(name,  date,  publisher, numberOfPages);
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
        return returnString;
    }
}
