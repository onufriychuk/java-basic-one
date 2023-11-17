package ru.otus.java.basic.homework20.client;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.Socket;

public class CalcClient {
    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                clientSocket = new Socket("localhost", 8088);
                reader = new BufferedReader(new InputStreamReader(System.in));
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                dataExchange(clientSocket);
            } finally {
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void dataExchange(Socket socket) throws IOException {
        System.out.println(in.readLine()); //ждем набор доступных комманд с сервера

        System.out.println("Введите число 1:");
        String num1 = reader.readLine();
        System.out.println("Введите число 2:");
        String num2 = reader.readLine();
        System.out.println("Введите действие:");
        String action = reader.readLine();
        out.write(num1 + "\n");
        out.write(num2 + "\n");
        out.write(action + "\n");
        out.flush();

        System.out.println(num1 + " " + action + " " + num2 + " = " + in.readLine());
    }
}
