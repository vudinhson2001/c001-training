package c001.com.daicent.btth_08_09.manage;

import c001.com.daicent.btth_08_09.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement implements Management<Student> {
    List<Student> students = new ArrayList<>();

    @Override
    public void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)){
                System.out.println(students.get(i));
                return i;
            }

        }
        System.err.println("Không tìm thấy tên này!!!!");
        return -1;

    }

    @Override
    public void add(Student student) {
        students.add(student);
    }
}
