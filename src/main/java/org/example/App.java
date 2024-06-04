package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        System.out.println("Введите путь к файлу: ");
        Scanner in = new Scanner(System.in);
        String pathToFile = in.nextLine();

        int[] numbers = readNumbersFromFile(pathToFile);

        System.out.println("Минимальное число: " + NumberOperations._min(numbers));
        System.out.println("Максимальное число: " + NumberOperations._max(numbers));
        System.out.println("Сумма всех чисел: " + NumberOperations._sum(numbers));
        System.out.println("Произведение всех чисел: " + NumberOperations._mult(numbers));
    }

    public static int[] readNumbersFromFile(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numberStrings = line.split(" ");

            int[] numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }

            return numbers;

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
            return new int[0];
        }
    }
}
