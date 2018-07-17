package app.creational.singelton;

/*
 * created by Mahbod Kh with ❤️.
 */


public class DatabaseConnection {

    private static DatabaseConnection instance = null;

    static {
        try {
            instance = new DatabaseConnection();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }


    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

}
