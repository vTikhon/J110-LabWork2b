package ru.avalon.vergentev.j110.labwork2b;

public class Multimedias extends FileParameters {
    private String description;
    private int time;



    //Constructors
    public Multimedias(String fileName, int fileSize, String format, String description, int time) {
        super(fileName, fileSize, format);
        setDescription(description);
        setTime(time);
    }


    //Methods
    @Override
    public void print() {
        super.print();
        System.out.print(getDescription() + ", " + (getTime()/60)/60 + ":" + (getTime()/60)%60 + ":" + getTime()%60);
    }


    //Setters and Getters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time < 0) {
            throw new IllegalArgumentException("Time must be more than zero");
        }
        this.time = time;
    }
}
