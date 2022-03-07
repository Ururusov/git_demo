package ru.rash.viktori;
//14.02.2022

public class StriToDoub {
    public static void main(String[] args) {
    String string = "12.84";
    //напишите тут ваш код

    int x = (int) (Math.round(Double.parseDouble(string)));
    System.out.println(x);

}
}
