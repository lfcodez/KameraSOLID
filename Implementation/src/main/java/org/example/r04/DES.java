package org.example.r04;


import org.example.MyPicture;

public class DES implements IEncryption{
    @Override
    public MyPicture encrypt(MyPicture p) {
        System.out.println("Encrypt DES");
        return null;
    }

    @Override
    public MyPicture decrypt(MyPicture p) {
        System.out.println("Decrypt DES");
        return null;
    }
}
