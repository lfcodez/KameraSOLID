package org.example;

import org.example.r01.Chip;
import org.example.r01.FourCoreChip;
import org.example.r02.ICameraSpeech;
import org.example.r03.IMemoryCard;
import org.example.r05.InternetChip;


public class Camera implements ICameraSpeech {
    private int pID = 0;
    private String serialNumber;
    private boolean isOn;
    private IRLed[] leds;
    private IMemoryCard memoryCard;
    private InternetChip internetChip;


    private Chip chip;

    private Camera(Builder b) {
        this.leds = new IRLed[24];
        for (int i = 0; i < 24; i++) {
            leds[i] = new IRLed();
        }
        this.memoryCard = b.memoryCard;
        this.chip = new FourCoreChip();
        this.internetChip = b.internetChip;
    }

    public Chip getChip() {
        return chip.getClone();
    }

    public boolean saveToCloud() {
        return internetChip.storePicture(new MyPicture());
    }

    public int[] getFaceArea(char[][] face) {

        return null;
    }

    @Override
    public void on() {
        System.out.println("Camera is ON");
    }

    @Override
    public char[][] getRawFace(int faceID) {
        System.out.println("given Face");
        return new char[0][];
    }

    @Override
    public MyPicture extractFace(char[][] face, int id, int[] area) {
        System.out.println("Extraced");
        return null;
    }

    @Override
    public void off() {
        System.out.println("Camera is OFF");
    }

    @Override
    public String speechControl() {
        System.out.println("Controlling via speech");
        return "Einfach irgendwas";
    }

    public void takePicture(char[][] content) {
        memoryCard.storePicture(new MyPicture(content, pID++));
    }

    public IMemoryCard getMemoryCard() {
        return this.memoryCard;
    }

    public static class Builder {
        private IMemoryCard memoryCard;
        private InternetChip internetChip;

        public Builder(IMemoryCard memoryCard, InternetChip internetChip) {

            this.internetChip = internetChip;
            this.memoryCard = memoryCard;
        }

        public Camera build() {
            return new Camera(this);
        }
    }

}
