package org.example;

import org.example.r03.MemoryCardHash;
import org.example.r03.MemoryCardStack;
import org.example.r04.AES;
import org.example.r05.InternetChip;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    ICamera c = new Camera.Builder(new MemoryCardStack(new AES()), new InternetChip()).build();
    c.on();
    c.off();


    }
}