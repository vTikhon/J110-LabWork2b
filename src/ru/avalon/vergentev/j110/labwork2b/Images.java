package ru.avalon.vergentev.j110.labwork2b;

public class Images extends FileParameters {
    private double widthImage, heightImage;



    //Constructors
    public Images(String fileName, int fileSize, String format, double widthImage, double heightImage) {
        super(fileName, fileSize, format);
        setwidthImage(widthImage);
        setheightImage(heightImage);
    }


    //Methods
    @Override
    public void print() {
        super.print();
        System.out.println(getwidthImage() + "x" + getheightImage());
    }


    //Setters and Getters
    public double getwidthImage() {
        return widthImage;
    }

    public void setwidthImage(double widthImage) {
        if (widthImage < 0) {
            throw new IllegalArgumentException("widthImage must be more than zero");
        }
        this.widthImage = widthImage;
    }

    public double getheightImage() {
        return heightImage;
    }

    public void setheightImage(double heightImage) {
        if (heightImage < 0) {
            throw new IllegalArgumentException("heightImage must be more than zero");
        }
        this.heightImage = heightImage;
    }
}
