package by.vania.questions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        String inText = text.nextLine();
        text.close();

        try(FileWriter writer = new FileWriter("TextRepeat.txt", true)){
            writer.write(inText);
            writer.append('\n');
            writer.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
