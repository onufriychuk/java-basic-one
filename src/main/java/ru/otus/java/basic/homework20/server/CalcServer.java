package ru.otus.java.basic.homework20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {
    private static Socket clientSocket;
    private static ServerSocket serverSocket;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                serverSocket = new ServerSocket(8088);
                System.out.println("Сервер запущен!");
                clientSocket = serverSocket.accept();
                try {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                    dataExchange(clientSocket);
                } finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            } finally {
                serverSocket.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private static void dataExchange(Socket socket) throws IOException {
        out.write("Вы подключились к CalcServer. Доступные операции: +, - , *, / \n");
        out.flush();
        double num1 = Double.parseDouble(in.readLine());
        double num2 = Double.parseDouble(in.readLine());
        String action = in.readLine();
        double result = calculate(num1, num2, action);
        System.out.println(num1 + " " + action + " " + num2 + " = " + result);
        out.write(result + "\n");
        out.flush();
    }

    public static double calculate(double num1, double num2, String action) {
        double result = 0;
        System.out.println(num1 + " " + num2 + " " + action);
        if (action.equals("+")) {
            result = num1 + num2;
        } else if (action.equals("-")) {
            result = num1 - num2;
        } else if (action.equals("*")) {
            result = num1 * num2;
        } else if (action.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("Введите доступный оператор");
        }
        return result;
    }
}
