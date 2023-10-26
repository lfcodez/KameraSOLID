package org.example.r04;


import org.example.MyPicture;

public interface IEncryption {
    public MyPicture encrypt(MyPicture p);
    public MyPicture decrypt(MyPicture p);

}
