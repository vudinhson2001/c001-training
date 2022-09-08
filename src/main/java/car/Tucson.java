package car;

import java.util.ArrayList;
import java.util.List;

public class Tucson extends HuynDai{
    private int quantity;

    public Tucson(int id, String name, int wheel, String color, String weight, int seat) {
        super(id, name, wheel, color, weight, seat);
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Tucson{" + getWeight()+" | "+getSeat()+ " | "+ getName()+" | "+getColor()+" | "+getWheel()+
                '}';
    }
}
