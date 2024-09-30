package org.example;

public class SmsSender implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
