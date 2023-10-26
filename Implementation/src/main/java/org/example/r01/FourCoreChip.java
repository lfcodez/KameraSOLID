package org.example.r01;

import org.example.Core;

public class FourCoreChip extends Chip {

    public FourCoreChip() {
        this.cores = new Core[]{new Core(), new Core(),new Core(), new Core()};
    }

    @Override
    public Chip getClone() {
        return new FourCoreChip();
    }
}
