package car;

public class Car {
    private int id;
    private String name;
    private int wheel;
    private String color;

    public Car(int id, String name, int wheel, String color) {
        this.id = id;
        this.name = name;
        this.wheel = wheel;
        this.color = color;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
