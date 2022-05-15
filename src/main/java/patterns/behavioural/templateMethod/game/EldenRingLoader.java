package patterns.behavioural.templateMethod.game;

public class EldenRingLoader extends BaseGameLoader {

    @Override
    void loadAssets() {
        System.out.println("Loading Elden Ring assets...");
    }

    @Override
    void createObjects() {
        System.out.println("Creating Elden Ring objects...");
    }

    @Override
    void loadConfig() {
        System.out.println("Loading Elden Ring config...");
    }

}
