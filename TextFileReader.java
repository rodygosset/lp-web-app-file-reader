
public abstract class TextFileReader extends FileReaderGeneric {

    public TextFileReader(String path) {
        super(path);
    }

    // this FileReader specializes in managing text files
    
    public abstract void print();

    // so viewing the contents of a file, in that case,
    // means showing the text to the screen

    public void viewContents() {
        print();
    }
    

}
