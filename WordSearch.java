

/**
 * This class searches words
 */
public class WordSearch extends HTMLFilteredReader
{

    public WordSearch(String urlName)
    {
        super(urlName);
    }


    /**
     *This method searches a word in a string.
     * @param word is the word that we are looking for.
     */
    public void searchWord( String word)
    {
        // if that page does not contain the word, give error message.
        if ( ! getPageContents().contains(word))
        {
            System.out.println("The word you search ("+ word + ") does not exist on this text!");

        }
        // else, get the index of the word and print it out together with the name of the word.
        else
        {
            int index = getPageContents().indexOf(word);
            System.out.println("The word you search was : " + word + ", was found at index " + index );
        }
    }
}
