package org.example.r05;


import org.example.MyPicture;

public class InternetChip implements ICloudStore {
    @Override
    public void connect() {
        System.out.println("Connected to Cloud");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Cloud");
    }

    @Override
    public boolean storePicture(MyPicture p) {
        System.out.println("Stored the picture!");
        return true;
    }
}
