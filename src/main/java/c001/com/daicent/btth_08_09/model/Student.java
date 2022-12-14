package c001.com.daicent.btth_08_09.model;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    private int point;

    public Student(int id, String name, int age, int point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.point = point;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && point == student.point && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, point);
    }

    @Override
    public String toString() {
        return "name= '" + name + '\'' + ", age= " + age + ", point= " + point;
    }
}
