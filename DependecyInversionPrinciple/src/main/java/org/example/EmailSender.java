package org.example;

public class EmailSender implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
