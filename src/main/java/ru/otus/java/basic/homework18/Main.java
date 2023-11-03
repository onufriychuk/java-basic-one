package ru.otus.java.basic.homework18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File folder = new File("./src/main/java/ru/otus/java/basic/homework18/files");
        List<File> files = new ArrayList<>();
        for (File file : folder.listFiles()) {
            if (file.isFile() && file.getPath().contains(".txt")) {
                files.add(file);
                System.out.println(file.getName());
            }
        }

        System.out.println("Какой файл вы хотели бы отредактировать? Введите название");
        Scanner scanner = new Scanner(System.in);
        String currentfile = folder + "/" + scanner.nextLine();
        File checkedFile = new File(currentfile);
        try {
            FileInputStream fileInputStream = new FileInputStream(checkedFile.getPath());
            int i;
            while ((i=fileInputStream.read())!=-1) {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
