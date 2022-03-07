package ru.sasha.vasia;

public class Vegetables{
    public static int counter;
    public int size;
    public int quality;

    public Vegetables(int size, int quality) {
        this.size = size;
        this.quality = quality;

    }


    public static void counter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
