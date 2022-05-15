package patterns.behavioural.templateMethod.game;

public abstract class BaseGameLoader {

    public void load() {
        loadAssets();
        createObjects();
        loadConfig();
        cleanTempFiles();
        syncData();
        System.out.println();
    }

    abstract void loadAssets();

    abstract void createObjects();

    abstract void loadConfig();

    protected void cleanTempFiles() {
        System.out.println("Cleaning temporary files...");
    }

    protected void syncData() {
        System.out.println("Synchronizing saved files...");
    }

}
