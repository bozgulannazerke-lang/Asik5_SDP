package Notification;

public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[SMS] Connecting to Telecom Gateway...");
        System.out.println("[SMS] Sending to " + recipient + ": " + message);
    }
}