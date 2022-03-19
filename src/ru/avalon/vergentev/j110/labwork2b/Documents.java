package ru.avalon.vergentev.j110.labwork2b;

import java.io.File;

public class Documents extends FileParameters {
    int listNumbers;


    //Constructors


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
