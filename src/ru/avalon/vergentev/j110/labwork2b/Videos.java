package ru.avalon.vergentev.j110.labwork2b;

public class Videos extends Multimedias {
    double mediaSize;


    //Constructors


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
