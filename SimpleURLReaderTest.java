import cs1.SimpleURLReader;

/**
 * This is a simple URL reader.
 * @author  Emre Karatas-22001641
 * @version 1.0 - 20.06.2021
 */
public class SimpleURLReaderTest
{

    public static void lineSeperator()
    {
        System.out.println("----------------------------------------------------------------------------------");
    }
    public static void main(String[] args)
    {
        // instantiating
        SimpleURLReader url = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        // methods
        lineSeperator();
        System.out.println( url.getPageContents().replaceAll("null",""));
        lineSeperator();
        System.out.println( "Number of lines in this URL: " + url.getLineCount() );
    }
}
