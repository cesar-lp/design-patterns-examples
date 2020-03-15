package patterns.creation.builder_directorless;

public class Main {
    public static void main(String[] args) {
        Unit wizardTank = new Unit.Builder(5, 5, 5)
            .energy(50)
            .useShield(true)
            .build();
    }
}
