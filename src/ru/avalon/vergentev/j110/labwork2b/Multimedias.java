package ru.avalon.vergentev.j110.labwork2b;

public class Multimedias extends FileParameters {
    private String description;
    private double time;



    //Constructors
    public Multimedias(String fileName, int fileSize, String format, String description, double time) {
        super(fileName, fileSize, format);
        setDescription(description);
        setTime(time);
    }


    //Methods
    @Override
    public void print() {
        super.print();
        System.out.println(getTime());
    }


    //Setters and Getters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        if (time < 0) {
            throw new IllegalArgumentException("Time must be more than zero");
        }
        this.time = time;
    }
}
