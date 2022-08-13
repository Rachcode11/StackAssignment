package Chapter9;

public class AudioBook extends Book {
    private int Size;
    private int playLength;
    private String PlayBackName;
    public AudioBook(String title, String yearOfPublication, String author,int Size) {
        super(title, yearOfPublication, author);
        this.Size = Size;
    }
    public void setSize(){
        this.Size = Size;
    }
    public int getSize(){
        return this.Size;
    }

    public int getPlayLength() {
        return playLength;
    }

    public void setPlayLength(int playLength) {
        this.playLength = playLength;
    }

    public String getPlayBackName() {
        return PlayBackName;
    }

    public void setPlayBackName(String playBackName) {
        PlayBackName = playBackName;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "Size ", Size,
                "PlayLength",playLength,
                "PlayBackName",PlayBackName);
    }

}
