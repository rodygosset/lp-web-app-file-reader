public class TextFileReaderPalindrome extends TextFileReader {

    public TextFileReaderPalindrome(String path) {
        super(path);
    }

    public void print() {
        // read the file and seperate each line
        String[] lines = new String(this.read()).lines().toArray(String[]::new);
        // print each line in reverse
        for(String line : lines) {
            // here we use a StringBuilder to reverse the current line
            System.out.println(new StringBuilder(line).reverse());
        }
    }

}
