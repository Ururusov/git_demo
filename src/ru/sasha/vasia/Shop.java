package ru.sasha.vasia;

public class Shop {

    public static void main(String[] args) {
        Vegetables tomato = new Tomato(8,7);

        tomato = new Tomato(2, 9);
        tomato = new Tomato(4,6);
        tomato = new Tomato(2,6);
        tomato = new Tomato(4,6);
        System.out.println(Tomato.getCounter());
    }
}
