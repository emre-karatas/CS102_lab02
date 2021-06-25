import cs1.SimpleURLReader;

/**
 * Th,s class have methods which are implemented on URLs.
 * @author Emre Karatas-22001641
 * @version v1.0 -21.06.2021
 */
public class MySimpleURLReader extends SimpleURLReader
{
    private String nameOfURL;

    public MySimpleURLReader( String urlName)
    {
        super(urlName);
        nameOfURL = urlName;
    }

    /**
     * This method gets the URL.
     * @return String is the URL.
     */
    public String getURL()
    {
        return nameOfURL;
    }

    /**
     * This method gets the name of the URL
     * @return is the name as String.
     */
    public String getName()
    {

        // getting as charArray
        char[] url = this.getURL().toCharArray();
        String fileName = "";
        // from the last element until the first, finding the first '/'
        for (int i = url.length-1; i > 0; i-- )
        {
            if ( url[i] == '/')
            {
                // getting from after '/' found
                fileName = this.getURL().substring(i+1);
                break;
            }

        }

        return fileName;
    }

    /**
     * This method calculates number of CSS files in the URL
     * @return is the CSS file count.
     */
    public int getNumberOfCSSLinks()
    {
        char[] content = getPageContents().toCharArray();
        int cssCount = 0;
        for ( int i = 0; i < content.length; i++)
        {
            // if that file contains <link, then look for css files
            if ( getPageContents().contains("<link"))
            {
                // it should occur as ".css"
                boolean occurs = content[i] == '.' && content[i + 1] == 'c' && content[i + 2] == 's' && content[i + 3] == 's';
                if ( occurs )
                {
                    cssCount++;
                }

            }
        }

        return cssCount;
    }


}
