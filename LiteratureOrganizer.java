import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
/**
 * Represents a collections of Literature.
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

    /**
     * Returns the size of the literature list.
     * @return the size of the literature list
     */
    public int listOfLiteratureSize()
    {
        return this.listOfLiterature.size();
    }

    /**
     * adds literature to the literatureorganizer
     * @param literature The literatur to add
     */
    public void addLiterature(Literature literature)
    {
        listOfLiterature.add(literature);
    }

    /**
     * Removes a literatur from the list by name
     * @param literature the literatur to remove
     */
    public void removeLiteratureByName(Literature literature)
    {
        this.listOfLiterature.remove(literature);
    }

    /**
     * Finds literature from the list by name
     * @param name the name to find
     * Returns the found literature
     * @return the found literature.
     */
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
