import cs1.SimpleURLReader;

public class SimpleURLReaderTest
{
    public static void lineSeperator()
    {
        System.out.println("---------------------------------------------");

    }
    public static void main(String[] args)
    {
        SimpleURLReader txtText = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        System.out.println( txtText.getPageContents().replaceAll("null",""));
        lineSeperator();
        System.out.println("The number of lines in this text: " + txtText.getLineCount());
    }
}
