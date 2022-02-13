package com.company.files;

// библиотека, чтобы считывать информацию с файлов
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// создаем класс FileNotFoundExceptionDemo, который вичитывает что-то из файла
public class FileNotFoundExceptionDemo {
    //    метод "main" выбрасывает исключение throws IOException
    public static void main(String[] args) throws IOException {
        File file = new File("/home/k-demchenko/Downloads/eale.png");
        FileReader fileReader = new FileReader(file);
        //   создаем новый массив
        char[] charArray = new char[100];
        fileReader.read(charArray);

        for (char character : charArray) {
            System.out.println(character);
        }
        fileReader.close();
    }
}
