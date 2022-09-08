package c001.com.daicent.btth_08_09.manage;

public interface Management<T> {
    void display();

    int findByName(String name);

    void add(T t);
}
