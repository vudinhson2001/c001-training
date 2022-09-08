package c001.com.daicent.btth_08_09.manage;

import c001.com.daicent.btth_08_09.model.Class;

import java.util.ArrayList;
import java.util.List;

public class ClassManagement implements Management<Class> {
    List<Class> classList = new ArrayList<>();

    @Override
    public void display() {
        for (int i = 0; i < classList.size(); i++) {
            System.out.println(classList.get(i));
        }
    }

    @Override
    public int findByName(String name) {

        return 0;
    }

    @Override
    public void add(Class aClass) {
        classList.add(aClass);
    }
}
