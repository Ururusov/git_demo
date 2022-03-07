package ru.sasha.vasia;
//оставить все уникальные символы чтобы не повторялись
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabaString {

    private static Scanner in = new Scanner(System.in);

    private static void showStartText(){
        System.out.println("Вводить с клавиотуры (0) или загрузить файл (1) ?");
        System.out.print("Ввидите индекс (0 или 1) : ");
    }

    private static void showErrorMessage(String errorText){
        System.out.println(errorText + "\n Индекс может быть только 0 или 1. \n Введите еще раз");
        System.out.println("-------------------------------------------");
    }

    private static byte enterSelection(){
        showStartText();
        byte selection;
        try {
            selection = in.nextByte();
        } catch (InputMismatchException e){
            showErrorMessage("Я понимаю только цифры");
            in.nextLine();
            selection = enterSelection();
        }
        if (selection != 0 && selection != 1){
            showErrorMessage("Ой йой...Цифры да не те...");
            selection = enterSelection();
        }
        return selection;
    }

    private static String enterFromKeyboard(){
        System.out.println("Выбран ввод с клавиатуры!");
        System.out.print("Введите строку: ");
        return in.nextLine();
    }

    private static String enterFileName(){
        System.out.println("Выбран ввод с файла!");
        System.out.print("Введите имя файла: ");
        return in.nextLine();
    }

    private static String enterFromFile(){
        File file = new File(enterFileName());
        String str = "";
        try (Scanner in = new Scanner(file)){
            while (in.hasNextLine()){
                str = in.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("Я не могу найти файл...\nПопробуйте еще разок ввести название");
            str = enterFromFile();
        }
        return str;
    }

    private static String input(){
        byte userSelection = enterSelection();
        String str;
        in.nextLine();
        if (userSelection == 0){
            str = enterFromKeyboard();
        } else {
            str = enterFromFile();
        }
        return str;
    }

    private static void create(HashSet<Character> characterHashSet, String str){
        for (int i = 0; i < str.length(); i++){
            characterHashSet.add(str.charAt(i));
        }
    }

    private static void showResult(HashSet<Character> characterHashSet){
        System.out.println("результат: " + characterHashSet);
    }

    public static void main(String[] args) {
        String str = input();
        HashSet<Character> characterHashSet = new HashSet<>();
        create(characterHashSet, str);
        showResult(characterHashSet);
    }
}
