package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        ANotification notification = NotificationFactory.getNotification("WhatsApp");
        notification.sendNotification();
        AGeometric square = ShapeFactory.getShape("Square");
    }
}
