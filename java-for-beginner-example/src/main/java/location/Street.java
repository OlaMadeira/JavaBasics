package location;

public class Street extends Object {
    public String name;
    public String description;
    public String key;

    public Street() {
        System.out.println("New street in the our city!");
    }

    public Street(String name, String description, String key) {
        this(name);

        this.description = description;
        this.key = key;
    }

    public Street(String name) {
        this();

        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + description + " " + key;
    }
}
