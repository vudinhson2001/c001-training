package car;

public class HuynDai extends Car {
    private String weight;
    private int seat;

    public HuynDai(int id, String name, int wheel, String color, String weight, int seat) {
        super(id, name, wheel, color);
        this.weight = weight;
        this.seat = seat;
    }

    public HuynDai(String weight, int seat) {
        this.weight = weight;
        this.seat = seat;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "HuynDai{" + "weight='" + weight + '\'' + ", seat=" + seat + '}';
    }
}
