package ru.rash.viktori;

public class Ceck {
    public int n = 10;

    public int[] createArray()
    {
        return new int[n];
    }

    public static void main(String[]args)
    {
        Ceck sol = new Ceck();
        int[] array = sol.createArray();

    }
}
