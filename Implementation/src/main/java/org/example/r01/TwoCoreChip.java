package org.example.r01;

import org.example.Core;

public class TwoCoreChip extends  Chip{

    public TwoCoreChip(){
        this.cores = new Core[]{new Core(), new Core()};
    }

    @Override
    public Chip getClone() {
        return new TwoCoreChip();
    }
}


