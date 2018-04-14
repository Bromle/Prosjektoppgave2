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
    private LiteratureOrganizer literatureOrganizer;
    private String[] menuItems = {
            "1. List all literatures",
            "2. Find a literature by name",
            "3. Add Newspaper",
            "4. Add Book",
            "5. Add Magazine",
            "6. Remove Literature by name",
        };

    public UserInterface()
    {
        literatureOrganizer = new LiteratureOrganizer();
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
                    this.listAllLiteratures();
                    break;

                    case 2:
                    this.printLiteratureByName();
                    break;

                    case 3:
                    addNewspaper();
                    break;

                    case 4:
                    addBook();
                    break;

                    case 5:
                    addMagazine();
                    break;

                    case 6:
                    removeLiteratureByName();
                    break;

                    case 7:
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

    private void addNewspaper()
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter the date: ");
        String date = inputScanner.nextLine();

        System.out.println("Enter the publisher: ");
        String publisher = inputScanner.nextLine();

        System.out.println("Enter the number of pages: ");
        int numberOfPages = inputScanner.nextInt();

        System.out.println("Enter the issuenumber: ");
        int issueNumber = inputScanner.nextInt();

        Literature newspaper = new Newspaper(name, date, publisher, numberOfPages, issueNumber);
        literatureOrganizer.addLiterature(newspaper);
    }

    private void addBook()
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter the date: ");
        String date = inputScanner.nextLine();

        System.out.println("Enter the publisher: ");
        String publisher = inputScanner.nextLine();

        System.out.println("Enter the number of pages: ");
        int numberOfPages = inputScanner.nextInt();

        inputScanner = new Scanner(System.in);
        System.out.println("Enter the author: ");
        String author = inputScanner.nextLine();

        Literature book = new Book(name, date, publisher, numberOfPages, author);
        literatureOrganizer.addLiterature(book);
    }

    private void addMagazine()
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter the date: ");
        String date = inputScanner.nextLine();

        System.out.println("Enter the publisher: ");
        String publisher = inputScanner.nextLine();

        System.out.println("Enter the number of pages: ");
        int numberOfPages = inputScanner.nextInt();

        System.out.println("Enter the price: ");
        double price = inputScanner.nextDouble();

        Literature magazine = new Magazine(name, date, publisher, numberOfPages);
        literatureOrganizer.addLiterature(magazine);
    }

    /**
     * Lists all the products/literature in the register
     */
    public void listAllLiteratures()
    {

        Iterator<Literature> it = literatureOrganizer.iterator();

        if (!it.hasNext())
        {
            System.out.println("There are no literature in stock!");
        }
        else
        {
            System.out.println("Literatures in stock are:");
            while(it.hasNext()){
                Literature n = it.next();
                System.out.println(n.getName());
            }
        }
    }

    /**
     * Find and return the newspaper with a name matching the parameter name.
     * @param name The name of the newspaper to search for.
     */
    private void printLiteratureByName()
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the name:");
        String searchString = inputScanner.nextLine();
        System.out.println();

        Literature foundLiterature = literatureOrganizer.findLiteratureByName(searchString);
        if(foundLiterature != null){
            System.out.println(foundLiterature.getName());
        }
        else{
            System.out.println("No litterature found by name: " + searchString);
        }
    }

    private void removeLiteratureByName()
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the name:");
        String searchString = inputScanner.nextLine();
        System.out.println();

        Literature foundLiterature = literatureOrganizer.findLiteratureByName(searchString);
        if(foundLiterature != null){
            literatureOrganizer.removeLiteratureByName(foundLiterature);
        }
        else{
            System.out.println("No litterature found by name: " + searchString);
        }
    }
}





