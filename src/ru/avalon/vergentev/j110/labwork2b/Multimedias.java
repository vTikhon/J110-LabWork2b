package ru.avalon.vergentev.j110.labwork2b;

public class Multimedias extends FileParameters {
    private String description;



    //Constructors
    public Multimedias(String fileName, int fileSize, String format, String description) {
        super(fileName, fileSize, format);
        setDescription(description);
    }


    //Methods


    //Setters and Getters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
