package org.example;

public class NotificationService {
    private Notifier notifier;

    // El servicio de notificación depende de Notifier
    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String message) {
        notifier.send(message);  // Polimorfismo, puede ser EmailSender o SmsSender
    }
}
