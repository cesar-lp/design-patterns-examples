package patterns.creation.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        UnitBuilder builder = new UnitBuilder();
        director.makeWizard(builder);
        Unit tank = builder.build();
    }
}
