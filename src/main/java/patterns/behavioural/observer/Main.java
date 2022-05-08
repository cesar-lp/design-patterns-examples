package patterns.behavioural.observer;

import patterns.behavioural.observer.publishers.EnvironmentCondition;
import patterns.behavioural.observer.publishers.EnvironmentChanger;
import patterns.behavioural.observer.subscribers.HumanPlayer;
import patterns.behavioural.observer.subscribers.RobotPlayer;
import patterns.behavioural.observer.subscribers.WerewolfPlayer;

public class Main {

    public static void main(String[] args) {
        var environmentChanger = new EnvironmentChanger();
        environmentChanger.change(EnvironmentCondition.SUNNY_DAY);
        environmentChanger.displaySubscribers();

        // we start the game with two characters
        var humanPlayer = new HumanPlayer(environmentChanger);
        var werewolfPlayer = new WerewolfPlayer(environmentChanger);

        environmentChanger.change(EnvironmentCondition.FULL_MOON);
        environmentChanger.displaySubscribers();

        // another character joins the game
        var robotPlayer = new RobotPlayer(environmentChanger);

        environmentChanger.change(EnvironmentCondition.THUNDERSTORM);
        environmentChanger.displaySubscribers();

        // one character dies
        werewolfPlayer.onDeath();
        environmentChanger.displaySubscribers();

        // the two players left abandon the game
        humanPlayer.onDeath();
        environmentChanger.displaySubscribers();

        robotPlayer.onDeath();
        environmentChanger.displaySubscribers();
    }

}
