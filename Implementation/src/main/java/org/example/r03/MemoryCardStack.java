package org.example.r03;

import org.example.MyPicture;

import org.example.r04.IEncryption;

import java.util.Stack;

public class MemoryCardStack implements IMemoryCard {

    private Stack<MyPicture> store;
    private IEncryption encryption;

    public MemoryCardStack(IEncryption encryption) {
        this.encryption = encryption;
    }

    @Override
    public void storePicture(MyPicture p) {

    }
}
