// Author : Filip Raguz
// Date : 26th November
// Purpose : The parent class for lab9

public abstract class LibraryItem implements LoanItem{
    private String type;
    private String ID;

    public LibraryItem(String t, String id) {
        type = t;
        this.ID = id;
    }

    public String getType() {
        return type;
    }

    public String getID() {
        return ID;
    }
}
