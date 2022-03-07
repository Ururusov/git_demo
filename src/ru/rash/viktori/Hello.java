package ru.rash.viktori;

public class Hello {
    private static int aStaticVariable = 1;
    private int aNonStaticVariable = 2;

    private static void aStaticMethod() {
        Hello object = new Hello();
        System.out.println(object.aNonStaticVariable);
        object.aNonStaticMethod();

    }

    private void aNonStaticMethod() {
        System.out.println(aStaticVariable);
    }

    public static void main(String[] args) {
        Hello.aStaticMethod();
    }
}
