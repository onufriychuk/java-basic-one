package ru.otus.java.basic.homework27;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        File folder = new File("./src/main/java/ru/otus/java/basic/homework27/");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String fileName = scanner.nextLine();
        System.out.println("Введите последовательность символов для поиска:");
        String searchedString = scanner.nextLine();
        scanner.close();
        int counter = 0;
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(folder.getPath() + "/" + fileName))) {
                byte[] data = bufferedInputStream.readAllBytes();
                String text = new String(data, StandardCharsets.UTF_8);
                while (text.contains(searchedString)) {
                    text = text.substring(text.indexOf(searchedString) + searchedString.length());
                    counter++;
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Последовательность " + searchedString + " встречается в файле " + counter + " раз.");

    }
}
