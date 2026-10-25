# Assignment #5 — Strategy Pattern

## Project Description
A modular **Notification Service** built in Java using the **Strategy behavioral design pattern**. The application allows the system to send notifications through different channels and switch strategies dynamically at runtime.

## Project Structure
- `NotificationStrategy.java` — Strategy interface declaring the common sending method.
- `EmailNotificationStrategy.java` — Concrete strategy for sending emails.
- `SmsNotificationStrategy.java` — Concrete strategy for sending SMS messages.
- `PushNotificationStrategy.java` — Concrete strategy for sending push notifications.
- `NotificationSender.java` — Context class holding a reference to the strategy and delegating execution.
- `Main.java` — Client class demonstrating strategy configuration and runtime switching.

## 5 Clean Code Principles Applied
1. **Elimination of conditional logic:** Replaced all `if/else` or `switch` statements with polymorphism.
2. **Meaningful, intention-revealing names:** Classes and methods have clear, descriptive names (`EmailNotificationStrategy`, `notifyUser`, etc.).
3. **Single Responsibility Principle (SRP):** Each strategy class encapsulates exactly one notification algorithm and nothing else.
4. **Context agnosticism:** The context (`NotificationSender`) remains completely independent of concrete strategy details.
5. **Easy extensibility (Open/Closed Principle):** New notification methods can be added by creating a new class implementing the interface, without modifying existing code.