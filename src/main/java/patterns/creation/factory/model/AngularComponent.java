package patterns.creation.factory.model;

public class AngularComponent implements Component {

    @Override
    public void render() {
        System.out.println("Displaying Angular component");
    }
}
