package ru.avalon.vergentev.j110.labwork2b;

public class Videos extends Multimedias {
    private int mediaWidth;
    private int mediaHeight;


    //Constructors
    public Videos(String fileName, int fileSize, String format, String description, double time, int mediaWidth, int mediaHeight) {
        super(fileName, fileSize, format, description, time);
        setMediaWidth(mediaWidth);
        setMediaHeight(mediaHeight);
    }


    //Methods
    @Override
    public void print() {
        super.print();
        System.out.println(getTime() + ", " + getMediaWidth() + "x" + getMediaHeight());
    }


    //Setters and Getters
    public int getMediaWidth() {
        return mediaWidth;
    }

    public void setMediaWidth(int mediaWidth) {
        this.mediaWidth = mediaWidth;
    }

    public int getMediaHeight() {
        return mediaHeight;
    }

    public void setMediaHeight(int mediaHeight) {
        this.mediaHeight = mediaHeight;
    }
}
