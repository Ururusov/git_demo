package com.serra.cack;

public class Duck  extends Animel{
    static int neck = 5;
    int size;

    public Duck(int size, String name) {
        super(name);
        this.size = size;
        System.out.println("кря " + size + " " + neck);

    }
}
