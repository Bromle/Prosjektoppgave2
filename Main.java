
/**
 * The Main-class of the application. This class only holds the main()-method
 * to start the application 
 * 
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (09.04.2018)
 */
public class Main
{
    /**
     * The main entry for the application.
     * @param args arguments provided during startup of the application
     */
    public static void main(String[] args)
    {
        UserInterface appUI = new UserInterface();
        appUI.start();
    }
}
