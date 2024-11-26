// Author : Filip Raguz
// Date : 26th November
// Purpose : A subclass of Library item

public class CD extends LibraryItem{ //implements is the keyword for implementing interfaces
    private String band;
    private String title;
    private int numTracks;

    public CD(String type, String id, String band, String title, int tNum) {
        super(type, id);
        this.band = band;
        this.title = title;
        this.numTracks = tNum;
    }

    public String getBand() {
        return band;
    }

    public String getTitle() {
        return title;
    }

    public int getTracks() {
        return numTracks;
    }

    public double calculatePrice() {
        return numTracks * 0.75;
    }
}
