
/**
 * Store details of a book.
 *
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (09.04.2018)
 */
public class Book extends Literature
{
    private final String author;
    /**
     * Create a Book.  
     * @param name The book name.
     * @param date Date it is published.
     * @param publisher the publisher of the book 
     * @param numberOfPages Number of pages in the.
     * @param author the author of the book
     */
    public Book(String name, String date, String publisher,
                      int numberOfPages, String author)
    {
        super(name, date,  publisher, numberOfPages);
        this.author = author;
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
        returnString += "\nIssuenumber: " + super.getPublisher();
        return returnString;
    }
}
