import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
/**
 * Write a description of class LiteratureOrganizer here.
 *
 *  * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (09.04.2018)
 */
public class LiteratureOrganizer
{
    // An Arraylist for storing objects of class Newspaper.
    private ArrayList<Literature> listOfLiterature;

    /**
     * Constructor for objects of class LiteratureOrganizer
     */
    public LiteratureOrganizer()
    {
        // initialise instance variables
        this.listOfLiterature = new ArrayList<Literature>();
    }

    public Iterator<Literature> iterator()
    {
        return listOfLiterature.iterator();
    }

    public int listOfLiteratureSize()
    {
        return this.listOfLiterature.size();
    }

    /**
     * adds literature to the literatureorganizer
     * @param litter
     */
    public void addLiterature(Literature literature)
    {
        listOfLiterature.add(literature);
    }

    public void removeLiteratureByName(Literature literature)
    {
        this.listOfLiterature.remove(literature);
    }

    public Literature findLiteratureByName(String name)
    {
        Iterator<Literature> it = this.listOfLiterature.iterator();
        Literature foundLiterature = null;
        while (it.hasNext() && foundLiterature == null)
        {
            Literature n = it.next();
            if (n.getName().equalsIgnoreCase(name))
            {
                foundLiterature = n;
            }
        }
        return foundLiterature;
    }
}
