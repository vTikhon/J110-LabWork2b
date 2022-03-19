package ru.avalon.vergentev.j110.labwork2b;

public class Main {
    public static void main(String[] args) {
        FileParameters [] files = new FileParameters[4];
        files[0] = new Documents("j110-lab2-hiers.docx", 23213, "docx", 2);
        files[1] = new Images("spb-map.png", 1703527, "image", 3072, 1024);
        files[2] = new Multimedias("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", 328);
        files[3] = new Videos("BackToTheFuture1.avi", 1470984192, "video", "Back to the future 1, 1985", 6488, 640,352);

        FileParameters.printAll(files);



    }
}
