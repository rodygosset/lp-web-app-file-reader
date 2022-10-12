public class TextFileReaderReverse extends TextFileReader {

    public TextFileReaderReverse(String path) {
        super(path);
    }

    public void print() {
        // read the file and seperate each line
        String[] lines = new String(this.read()).lines().toArray(String[]::new);
        // print the file's content line by line in reverse order
        for(int i = lines.length - 1; i >= 0 ; i--) {
            System.out.println(lines[i]);
        }
    }


}
