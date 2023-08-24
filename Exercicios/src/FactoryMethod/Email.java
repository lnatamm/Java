package FactoryMethod;

public class Email extends ANotification{
    @Override
    void sendNotification() {
        System.out.println("Email!");
    }
}
