
public class TextFileReaderGeneric extends TextFileReader {

    public TextFileReaderGeneric(String path) {
        super(path);
    }

    public void print() {
        // get the text
        String fileContents = new String(this.read());
        // print it
        System.out.println(fileContents);
    }


}
