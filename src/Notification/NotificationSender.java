package Notification;

public class NotificationSender {
    private NotificationStrategy strategy;

    public NotificationSender(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void notifyUser(String recipient, String message) {
        strategy.send(recipient, message);
    }
}