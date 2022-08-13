package Chapter9;

public class PrintBook extends Book {
    private String publisher;
    private String ISBN;

    public PrintBook(String title, String yearOfPublication, String author, String publisher, String ISBN) {
        super(title, yearOfPublication, author);
        this.publisher = publisher;
        this.ISBN = ISBN;

    }
    public void setPublisher(){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setISBN(){
        this.ISBN = ISBN;
    }
    public String getISBN(){
        return ISBN;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "Publisher ", publisher,
                "ISBN",ISBN);
    }

}
