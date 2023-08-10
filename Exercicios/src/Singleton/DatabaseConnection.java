package Singleton;

public class DatabaseConnection {

    private static DatabaseConnection connection;

    public static DatabaseConnection getConnection(){
        if(connection == null){
            connection = new DatabaseConnection();
        }
        return connection;
    }

}
