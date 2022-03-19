package ru.avalon.vergentev.j110.labwork2b;

public class Images extends FileParameters {
    double widthImage, heightImage;



    //Constructors


    //Methods


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
