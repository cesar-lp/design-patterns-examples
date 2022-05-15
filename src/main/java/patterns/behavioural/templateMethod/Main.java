package patterns.behavioural.templateMethod;

import patterns.behavioural.templateMethod.game.DarkSoulsLoader;
import patterns.behavioural.templateMethod.game.EldenRingLoader;

public class Main {

    public static void main(String[] args) {
        var darkSoulsLoader = new DarkSoulsLoader();
        darkSoulsLoader.load();

        // user changes game

        var eldenRingLoader = new EldenRingLoader();
        eldenRingLoader.load();
    }

}
