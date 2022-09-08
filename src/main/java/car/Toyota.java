package car;

public class Toyota extends Car{
    private int seat;
    private String weight;

    public Toyota(int id, String name, int wheel, String color, int seat, String weight) {
        super(id, name, wheel, color);
        this.seat = seat;
        this.weight = weight;
    }

    public Toyota(int seat, String weight) {
        this.seat = seat;
        this.weight = weight;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toyota{" + getWeight()+" | "+getSeat()+ " | "+ getName()+" | "+getColor()+" | "+getWheel()+
                '}';
    }
}
