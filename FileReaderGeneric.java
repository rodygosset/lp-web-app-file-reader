import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class FileReaderGeneric implements FileReader {
    

    // path to the file

    private String filePath;

    public FileReaderGeneric(String path) {
        this.filePath = path;
    }

    public byte[] read() {
        try {
            return Files.readAllBytes(Path.of(this.filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    // viewContents() is to be implemented in concrete child classes
    // which is why this class is abstract

}

