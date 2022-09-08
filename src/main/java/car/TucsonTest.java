package car;

import java.util.LinkedList;

public class TucsonTest implements Management<Tucson> {
    private static Tucson[] tucsons = new Tucson[5];
    private static int size = 0;

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(tucsons[i]);
        }
    }

    @Override
    public void add(Tucson tucson) {
        tucsons[size] = tucson;
        size++;
    }
    public static void main(String[] args) {
        TucsonTest tucsonTest = new TucsonTest();
        Tucson tucson =new Tucson(1,"Tucson",4,"Xanh","500kg",4);
        Tucson tucson1 =new Tucson(1,"Tucson",4,"Xanh Duong","500kg",4);
        tucsonTest.add(tucson);
        tucsonTest.add(tucson1);
        tucsonTest.display();

    }
}
