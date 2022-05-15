package patterns.behavioural.templateMethod.game;

public class DarkSoulsLoader extends BaseGameLoader {

    @Override
    void loadAssets() {
        System.out.println("Loading Dark Souls assets...");
    }

    @Override
    void createObjects() {
        System.out.println("Creating Dark Souls objects...");
    }

    @Override
    void loadConfig() {
        System.out.println("Loading Dark Souls config...");
    }

}
