package ru.otus.java.basic.homework14;

public class AppArrayDataException extends RuntimeException {
    public AppArrayDataException() {
    }

    public AppArrayDataException(String message) {
        super(message);
    }

    public AppArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
