package patterns.creation.factory.model;

public class ReactComponent implements Component {

    @Override
    public void render() {
        System.out.println("Displaying React component");
    }
}
