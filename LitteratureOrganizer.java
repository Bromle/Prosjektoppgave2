import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
/**
 * Write a description of class LitteratureOrganizer here.
 *
 *  * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (09.04.2018)
 */
public class LitteratureOrganizer
{
     // An Arraylist for storing objects of class Newspaper.
    private ArrayList<Litterature> listOfLitterature;

    /**
     * Constructor for objects of class LitteratureOrganizer
     */
    public LitteratureOrganizer()
    {
        // initialise instance variables
        this.listOfLitterature = new ArrayList<Litterature>();
    }

    public Iterator<Litterature> iterator()
    {
        return listOfLitterature.iterator();
    }
    
    public int listOfLitteratureSize()
    {
        return this.listOfLitterature.size();
    }
    
    /**
     * adds litterature to the litteratureorganizer
     * @param litter
     */
    public void addLitterature(String name, String date,
                                int numberOfPages)
    {
        listOfLitterature.add(new Litterature(name, date, numberOfPages));
    }
    
    public void removeLitterature(int index)
    {
        this.listOfLitterature.remove(index);
    }
    
}
