
/**
 * Write a description of class Magazine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magazine extends Literature
{
    /**
     * Constructor for objects of class Magazine
     */
    public Magazine(String name, String date, String publisher, int numberOfPages)
    {
        super(name,  date,  publisher, numberOfPages);
    }

    public String getData()
    {
        String returnString = super.getName();
        returnString += "\nDate: " + super.getDate();
        returnString += "\nNumber of pages: " + super.getNumberOfPages();
        returnString += "\nPrice: " + super.getPrice();
        return returnString;
    }
}
