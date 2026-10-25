package Notification;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[EMAIL] Connecting to SMTP server...");
        System.out.println("[EMAIL] Sending to " + recipient + ": " + message);
    }
}