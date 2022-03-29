package ru.avalon.vergentev.j110.labwork2b;

public class FileParameters {
    private String fileName;
    private int fileSize;
    private String format;



    //Constructors
    public FileParameters(String fileName, int fileSize, String format) {
        setFileName(fileName);
        setFileSize(fileSize);
        setFormat(format);
    }


    //Methods
    public void print () {
        System.out.println('\n');
        System.out.print(getFileName() + "     " + getFileSize() + "     " + getFormat() + ", ");
    }

    public static void printAll (FileParameters [] files) {
        for (int i = 0; i < files.length; i++) {
            files[i].print();
        }
    }



    //Setters and Getters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        if (fileName == null) {
            throw new IllegalArgumentException("File name must have the name");
        }
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        if (fileSize < 0) {
            throw new IllegalArgumentException("File size must be more than zero");
        }
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format == null) {
            throw new IllegalArgumentException("Format of file must have the name of format");
        }
        this.format = format;
    }
}
