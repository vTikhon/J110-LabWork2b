package ru.avalon.vergentev.j110.labwork2b;

public class Videos extends Multimedias {
    private int widthMedia;
    private int heightMedia;


    //Constructors
    public Videos(String fileName, int fileSize, String format, String description, int time, int widthMedia, int heightMedia) {
        super(fileName, fileSize, format, description, time);
        setWidthMedia(widthMedia);
        setHeightMedia(heightMedia);
    }


    //Methods
    @Override
    public void print() {
        super.print();
        System.out.print(", " + getWidthMedia() + "x" + getHeightMedia());
    }


    //Setters and Getters
    public int getWidthMedia() {
        return widthMedia;
    }

    public void setWidthMedia(int widthMedia) {
        if (widthMedia < 0) {
            throw new IllegalArgumentException("Width of media must be more than zero");
        }
            this.widthMedia = widthMedia;
    }

        public int getHeightMedia () {
            return heightMedia;
        }

        public void setHeightMedia (int heightMedia) {
            if (heightMedia < 0) {
                throw new IllegalArgumentException("Height of media must be more than zero");
            }
            this.heightMedia = heightMedia;
        }
}

