package set.com.daicent;

import java.util.Objects;

public class HocSinh {
    private String name;
   private int id;
   private int cmnd;

    public HocSinh() {
    }

    public HocSinh(String name, int id, int cmnd) {
        this.name = name;
        this.id = id;
        this.cmnd = cmnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cmnd=" + cmnd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocSinh hocSinh = (HocSinh) o;
        return id == hocSinh.id && cmnd == hocSinh.cmnd && Objects.equals(name, hocSinh.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id, cmnd);
    }
}
