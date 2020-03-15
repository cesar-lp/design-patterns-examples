package patterns.creation.singleton;

public class Database {

    private static Database instance;

    private Database() {}

    public static Database getInstance() {
        // double locking to reduce overhead of sync method
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}
