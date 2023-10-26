package org.example.r04;


import org.example.MyPicture;

public class AES implements IEncryption{

    @Override
    public MyPicture encrypt(MyPicture p) {
        System.out.println("Encrypt AES");
        return null;
    }

    @Override
    public MyPicture decrypt(MyPicture p) {
        System.out.println("Decrypt AES");
        return null;
    }
}
