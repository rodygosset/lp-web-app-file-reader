public abstract class ImageFileReader extends FileReaderGeneric {

    public ImageFileReader(String path) {
        super(path);
    }
    
    // this FileReader deals with image files

    public abstract void show();

    // so viewing the content of a file here means showing a picture

    public void viewContents() {
        show();
    }
    

}
