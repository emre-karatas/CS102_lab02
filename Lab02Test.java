/**
 * This class is a test class for Lab02
 * @author Emre Karatas-22001641
 * @version 1.0 - 23.06.2021
 */
public class Lab02Test
{
    public static void main ( String[] args)
    {
        System.out.println("Welcome to Lab02 Demo!");
        SimpleURLReaderTest.lineSeperator();


        // PART B. Testing MySimpleURLReader
        MySimpleURLReader simpleURL = new MySimpleURLReader(" http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        System.out.println("URL: " + simpleURL.getURL() );
        System.out.println("URL Name: " + simpleURL.getName());

        //PART C. Testing MySimpleURLReader getNumberOfCSSLinks()
        System.out.println( "Number of CSS Files in URL: " + simpleURL.getNumberOfCSSLinks());
        SimpleURLReaderTest.lineSeperator();
        MySimpleURLReader txtUrl = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        System.out.println("URL: " + txtUrl.getURL());
        System.out.println("URL Name: " + txtUrl.getName());
        System.out.println( "Number of CSS Files in URL: " + txtUrl.getNumberOfCSSLinks());
        SimpleURLReaderTest.lineSeperator();

        // PART D. Testing HTMLFilteredReader
        HTMLFilteredReader htmlFile = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        System.out.println(htmlFile.getPageContents());
        SimpleURLReaderTest.lineSeperator();

        // PART E. Testing WordSearch
        WordSearch searchable = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        searchable.searchWord("Turkey");
        SimpleURLReaderTest.lineSeperator();
        searchable.searchWord("Ankara");
        SimpleURLReaderTest.lineSeperator();
        searchable.searchWord("Emre");

    }
}
