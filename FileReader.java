public interface FileReader {

    // defines the contract that FileReaders have to fulfill

    public byte[] read();

    // view file contents
    
    public void viewContents();

    // that means something different depending on the type of file the FileReader deals with
}
