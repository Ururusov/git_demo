package ru.sasha.vasia;

    public class Tomato extends Vegetables {
        public static int counter;

        public Tomato(int size, int quality) {

            super(size, quality);
            counter++;
            System.out.println(counter);
        }
        public static int getCounter() {
            return counter;
        }

    }
