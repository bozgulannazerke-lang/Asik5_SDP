package Notification;

public class PushNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[PUSH] Connecting to Firebase Cloud Messaging...");
        System.out.println("[PUSH] Sending to device " + recipient + ": " + message);
    }
}