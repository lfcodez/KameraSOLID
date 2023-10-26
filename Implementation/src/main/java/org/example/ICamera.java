package org.example;

public interface ICamera {

    public void on();
    public char[][] getRawFace(int faceID);
    public MyPicture extractFace(char[][] face,int id,int[] area);
    public void off();




}
