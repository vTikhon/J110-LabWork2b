package ru.avalon.vergentev.j110.labwork2b;

public class Videos extends Multimedias {
    private double mediaSize;


    //Constructors
    public Videos(String fileName, int fileSize, String format, String description, double mediaSize) {
        super(fileName, fileSize, format, description);
        setMediaSize(mediaSize);
    }


    //Methods


    //Setters and Getters
    public double getMediaSize() {
        return mediaSize;
    }

    public void setMediaSize(double mediaSize) {
        if (mediaSize < 0) {
            throw new IllegalArgumentException("Media size must be more than zero");
        }
        this.mediaSize = mediaSize;
    }
}
