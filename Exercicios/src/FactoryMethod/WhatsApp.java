package FactoryMethod;

public class WhatsApp extends ANotification{
    @Override
    void sendNotification() {
        System.out.println("WhatsApp!");
    }
}
