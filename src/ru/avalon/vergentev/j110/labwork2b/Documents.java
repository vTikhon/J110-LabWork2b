package ru.avalon.vergentev.j110.labwork2b;

import java.io.File;

public class Documents extends FileParameters {
    private int listNumbers;


    //Constructors
    public Documents(String fileName, int fileSize, String format, int listNumbers) {
        super(fileName, fileSize, format);
        setListNumbers(listNumbers);
    }


    //Methods


    //Setters and Getters
    public int getListNumbers() {
        return listNumbers;
    }

    public void setListNumbers(int listNumbers) {
        if (listNumbers < 3) {
            throw new IllegalArgumentException("Quantity of pages must be more than three");
        }
        this.listNumbers = listNumbers;
    }
}
