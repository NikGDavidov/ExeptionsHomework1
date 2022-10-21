package HW1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main1 {
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void main(String[] args) {
        divide (4,0);
        fileNotfound();
        outOfBound();

    }
    static void divide (int x, int y){
        try {
            double result = x / y;
        }
        catch (RuntimeException e){
            System.out.println("Деление на ноль недопустимо");
        }
    }
    static void fileNotfound() {
        try {
            FileReader fl = new FileReader(new File("s.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");

        }

    }
    static void outOfBound (){
        int x [] = new int[]{2,3,5};
        try{
            int y = x[4];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("В массиве нет элемента с таким индексом");
        }
    }
        }