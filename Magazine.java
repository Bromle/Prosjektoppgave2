
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


}
