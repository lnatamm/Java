package FactoryMethod;

public class SMS extends ANotification{
    @Override
    void sendNotification() {
        System.out.println("SMS!");
    }
}
