import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Write a description of class UserInterface here.
 *
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (12.02.2018)
 */
public class UserInterface
{
    private NewspaperOrganizer newspaperOrganizer;
    private String[] menuItems = {
            "1. List all newspapers",
            "2. Add new newspaper",
            "3. Find a newspaper by name",
            "4. For later use",
        };

    public UserInterface()
    {
        newspaperOrganizer = new NewspaperOrganizer();
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    public void start() 
    {
        this.init();

        boolean quit = false;

        while (!quit) 
        {
            try 
            {
                int menuSelection = this.showMenu();
                switch (menuSelection) 
                {
                    case 1:
                    this.listAllNewspapers();
                    break;

                    case 2:
                    addNewspaper();
                    break;

                    case 3:
                    this.findNewspaperByName();
                    break;

                    case 5:
                    System.out.println("\nThank you for using Application v0.1. Bye!\n");
                    quit = true;
                    break;

                    default:
                }
            } 
            catch (InputMismatchException ime) 
            {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }        

    }

    /**
     * Initializes the application.
     * Typically you would create the LiteratureRegistrer-instance here
     */
    private void init()
    {
        System.out.println("init() was called");
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items. 
     * If the user inputs anything else, an InputMismatchException is thrown. 
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException if user enters an invalid number/menu choice
     */
    private int showMenu() throws InputMismatchException 
    {
        System.out.println("\n**** Application v0.1 ****\n");
        // Display the menu
        for ( String menuItem : menuItems )
        {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");
        // Read input from user
        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) 
        {
            throw new InputMismatchException();
        }
        return menuSelection;
    }

    /**
     * Adds a newspaper to the newspaperorganizer.
     * @param newspaper The newspaper to add
     */
    public void addNewspaper()
    {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter the name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter the date of publishing: ");
        String date = inputScanner.nextLine();

        System.out.println("Enter the number of pages in the newpaper: ");
        int numberOfPages = inputScanner.nextInt();

        System.out.println("Enter the issuenumber: ");
        int issueNumber = inputScanner.nextInt();

        newspaperOrganizer.addNewspaper(name, issueNumber, date, numberOfPages);
    }

    /**
     * Lists all the products/literature in the register
     */
    public void listAllNewspapers()
    {
        Iterator<Newspaper> it = newspaperOrganizer.iterator();
        if (!it.hasNext())
        {
            System.out.println("There are no newspapers in stock!");
        }
        else
        {
            System.out.println("Newspapers in stock are:");
            while(it.hasNext()){
                Newspaper n = it.next();
                System.out.println(n.getName());
            }
        }
    }

    /**
     * Find and return the newspaper with a name matching the parameter name.
     * @param name The name of the newspaper to search for.
     */
    public void findNewspaperByName()
    {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter the name:");
        String searchString = inputScanner.nextLine();
        System.out.println();

        Iterator<Newspaper> it = newspaperOrganizer.iterator();
        while (it.hasNext())
        {
            Newspaper n = it.next();
            if (n.getName().equalsIgnoreCase(searchString))
            {
                System.out.println(n.toString());
            }
        }
    }
}
