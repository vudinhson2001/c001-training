package animal;

public class Dog extends Pet {
    private String sound;
    public Dog(int id, String name, String color) {
        super(id, name, color);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Dog(int id, String name, String color, String sound) {
        super(id, name, color);
        this.sound = sound;
    }
}
