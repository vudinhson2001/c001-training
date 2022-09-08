package animal;

public class Cat extends Pet{
    private String sound;
    public Cat(int id, String name, String color) {
        super(id, name, color);
    }

    public Cat(int id, String name, String color, String sound) {
        super(id, name, color);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Cat{" + "sound: " + sound + ", name: " + getName()+", color: " + getColor()+'}';
    }

    public static void main(String[] args) {
        Cat cat = new Cat(1,"cat","black","meo meo");
        Cat cat1 = new Cat(1,"cat 1","brown","meo meo meo");
        System.out.println(cat1);
        System.out.println(cat);
    }
}
