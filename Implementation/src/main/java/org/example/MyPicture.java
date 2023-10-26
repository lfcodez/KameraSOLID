package org.example;

public class MyPicture {
    private  int faceID;
    private char[][] content;
    private long nanoTimestamp;

    public MyPicture(char[][] content, int faceID){
    this.faceID = faceID;
    this.content = content;
    }

    public int getFaceID() {
        return faceID;
    }
}
