import Notification.*;

public class Main {
    public static void main(String[] args) {
        NotificationSender sender = new NotificationSender(new EmailNotificationStrategy());
        sender.notifyUser("user@example.com", "Your order has been successfully placed!");

        sender.setStrategy(new SmsNotificationStrategy());
        sender.notifyUser("+77071234567", "Your verification code is: 1234");

        sender.setStrategy(new PushNotificationStrategy());
        sender.notifyUser("device_id_789", "You have a new message!");
    }
}