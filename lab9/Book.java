// Author : Filip Raguz
// Date : 26th November
// Purpose : A subclass of LibraryItem

public class Book extends LibraryItem{ //implements is the keyword for implementing interfaces
    private String author;
    private String title;
    private int numPages;

    public Book(String type, String id, String author, String title, int pNum) {
        super(type, id);
        this.author = author;
        this.title = title;
        this.numPages = pNum;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return numPages;
    }

    public double calculatePrice() {
        return numPages * 0.20;
    }
}
