package ru.avalon.vergentev.j110.labwork2b;

public class Images extends FileParameters {
    private int widthImage, heightImage;



    //Constructors
    public Images(String fileName, int fileSize, String format, int widthImage, int heightImage) {
        super(fileName, fileSize, format);
        setwidthImage(widthImage);
        setheightImage(heightImage);
    }


    //Methods
    @Override
    public void print() {
        super.print();
        System.out.print(getheightImage() + "x" + getwidthImage());
    }


    //Setters and Getters
    public int getwidthImage() {
        return widthImage;
    }

    public void setwidthImage(int widthImage) {
        if (widthImage < 0) {
            throw new IllegalArgumentException("widthImage must be more than zero");
        }
        this.widthImage = widthImage;
    }

    public int getheightImage() {
        return heightImage;
    }

    public void setheightImage(int heightImage) {
        if (heightImage < 0) {
            throw new IllegalArgumentException("heightImage must be more than zero");
        }
        this.heightImage = heightImage;
    }
}
