package org.example.r03;

import org.example.MyPicture;

import org.example.r04.IEncryption;

import java.util.HashMap;

public class MemoryCardHash implements IMemoryCard {

    private HashMap<Integer, MyPicture> store;
    private IEncryption encryption;

    public MemoryCardHash(IEncryption encryption){
        this.encryption = encryption;
    }

    @Override
    public void storePicture(MyPicture p) {
        store.put(p.getFaceID(), p);
    }

}
