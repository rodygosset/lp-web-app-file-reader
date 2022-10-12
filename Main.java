public class Main {
    
    public static void main(String[] args) {
        String filePath = "my-text-file.txt";
        System.out.println("Opening my-text-file.txt...");
        System.out.println("-- Normal FileReader -->");
        TextFileReader fileReader = new TextFileReaderGeneric(filePath);
        fileReader.viewContents();
        System.out.println("-- Reverse FileReader -->");
        fileReader = new TextFileReaderReverse(filePath);
        fileReader.viewContents();
        System.out.println("-- Palindromic FileReader -->");
        fileReader = new TextFileReaderPalindrome(filePath);
        fileReader.viewContents();
    }

}


