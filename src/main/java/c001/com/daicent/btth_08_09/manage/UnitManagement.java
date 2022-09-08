package c001.com.daicent.btth_08_09.manage;

import c001.com.daicent.btth_08_09.model.Unit;

import java.util.ArrayList;
import java.util.List;

public class UnitManagement implements Management<Unit> {
    List<Unit> unitList = new ArrayList<>();

    public void display() {
        for (int i = 0; i < unitList.size(); i++) {
            System.out.println(unitList.get(i));
        }
    }

    @Override
    public int findByName(String name) {

        return 0;
    }

    @Override
    public void add(Unit unit) {
        unitList.add(unit);
    }
}
