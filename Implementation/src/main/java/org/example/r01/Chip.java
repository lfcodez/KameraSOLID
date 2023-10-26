package org.example.r01;

import org.example.Core;

import java.util.UUID;

public abstract class Chip {

    private String uuID;
    protected Core[] cores;

    public int coreAmount(){
        return this.cores.length;
    }

    public abstract Chip getClone();


}
