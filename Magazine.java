
/**
 * Write a description of class Magazine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magazine extends Litterature
{
    Boolean scientific;
    Boolean tabloid;

    /**
     * Constructor for objects of class Magazine
     */
    public Magazine(String name, String date, int numberOfPages)
    {
        super(name, date, numberOfPages);
        this.scientific = false;
        this.tabloid = false;
    }

    public String toString()
    {
        String returnString = super.getName();
        returnString += "\nDate: " + super.getDate();
        returnString += "\nNumber of pages: " + super.getNumberOfPages();
        returnString += "\nPrice: " + super.getPrice;
        if(scientific = true) {
            returnString += "\nScientific magazine";
        }
        else if(tabloid = true){
            returnString += "\nTabloid magazine";
        }
        return returnString;
    }
}
