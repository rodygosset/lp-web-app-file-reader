public abstract class AudioFileReader extends FileReaderGeneric {

    public AudioFileReader(String path) {
        super(path);
    }
    
    // this FileReader deals with audio files

    public abstract void play();

    // so here, viewing the content of such files means to play the audio
    
    public void viewContents() {
        play();
    }

}
