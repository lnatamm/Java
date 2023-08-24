package FactoryMethod;

public class NotificationFactory {
    public static ANotification getNotification(String name){
        if(name.equals("SMS")){
            return new SMS();
        }
        if(name.equals("Email")){
            return new Email();
        }
        if(name.equals("WhatsApp")){
            return new WhatsApp();
        }
        return null;
    }
}
