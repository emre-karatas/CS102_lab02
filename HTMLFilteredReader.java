

/**
 * This class have filtered URL methods.
 * @author emre karatas-22001641
 * @version v1.1-23.06.2021
 */
public class HTMLFilteredReader extends MySimpleURLReader
{

    public HTMLFilteredReader(String urlName)
    {
        super(urlName);
    }

    /**
     * This method gets filtered page contents
     */
    @Override
    public String getPageContents()
    {
        // creating char array
        char[] withoutHTML = getUnfilteredPageContents().toCharArray();
        // for getting indexes of '<' and '>'
        int start=0;
        int end = 0;
        // the output as a result
        String output = "";
        for ( int i = 0; i < withoutHTML.length; i++)
        {
            // getting index of '<'
            if ( withoutHTML[i] == '<')
            {
                start = i;
            }
            // getting index of '>'
            else if ( withoutHTML[i] == '>')
            {
                end = i;
            }
            // after getting indexes
            if ( start != 0 && end != 0 && start > end+1 )
            {
                //calling the method below and substring as bounds for end+1 and start
                output = output + getUnfilteredPageContents().substring(end + 1, start);
                // to continue the loop
                start = 0;
                end = 0;
            }
        }
        return output;
    }

    /**
     * This method gets unfiltered page content.
     * @return String is the unfiltered page content.
     */
    public String getUnfilteredPageContents()
    {
        // we should call the super method since we have already getPageContents method in this class.
        return super.getPageContents();
    }


}

