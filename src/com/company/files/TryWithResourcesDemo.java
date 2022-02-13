package com.company.files;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        //   выполняем try с ресурсами
        try(FileReader fileReader = new FileReader("resources/message.txt")){
            char[] charArray = new char[100];
            fileReader.read(charArray);
            for (char character : charArray) {
                System.out.println(character);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("something went wrong");
        }
    }
}
