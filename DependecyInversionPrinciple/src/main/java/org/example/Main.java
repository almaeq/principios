package org.example;

// Las clases de nivel alto (contienen la lógica del negocio) no dependan directamente de las clases de nivel bajo (implementaciones concretas).
// Ambas dependen de absttracciones (interfaces, clases abstractas)
public class Main {
    public static void main(String[] args) {
        // Enviamos notificación usando EmailSender
        Notifier emailNotifier = new EmailSender();
        NotificationService emailService = new NotificationService(emailNotifier);
        emailService.sendNotification("Your order has been shipped!");

        // Enviamos notificación usando SmsSender
        Notifier smsNotifier = new SmsSender();
        NotificationService smsService = new NotificationService(smsNotifier);
        smsService.sendNotification("Your package is arriving today!");
    }
}