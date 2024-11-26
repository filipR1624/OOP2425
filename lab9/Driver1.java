// Author : Filip Raguz
// Date : 26th November
// Purpose : The driver program for lab9

public class Driver1 {
    public static void main(String[] args) {
        // the LibraryItem array
        LibraryItem[] items = new LibraryItem[2];

        // an instance of a book
        Book book = new Book("fairytale", "B001", "aGuy", "Once Upon A Time...", 130);
        // an instance of CD
        CD cd = new CD("punk", "CD001", "theBand", "theTitle", 12);

        // filling the array
        items[0] = book;
        items[1] = cd;

        for (LibraryItem item: items) {
            if (item instanceof CD) {
                CD a = (CD) item;
                System.out.println("CD price: " + a.calculatePrice());
            }
            else if (item instanceof Book) {
                Book b = (Book) item;
                System.out.println("Book price: " + b.calculatePrice());
            }
        }

    }
}
