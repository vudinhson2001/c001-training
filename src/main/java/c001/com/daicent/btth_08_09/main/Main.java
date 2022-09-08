package c001.com.daicent.btth_08_09.main;

import c001.com.daicent.btth_08_09.manage.ClassManagement;
import c001.com.daicent.btth_08_09.manage.StudentManagement;
import c001.com.daicent.btth_08_09.manage.UnitManagement;
import c001.com.daicent.btth_08_09.model.Class;
import c001.com.daicent.btth_08_09.model.School;
import c001.com.daicent.btth_08_09.model.Student;
import c001.com.daicent.btth_08_09.model.Unit;
import java.util.*;

public class Main implements Comparator<Student> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        UnitManagement unitManagement = new UnitManagement();
        ClassManagement classManagement = new ClassManagement();
        List<School> school = new ArrayList<>();
        System.out.println("Tên trường");
        school.add(new School(1, "Daicent"));
        System.out.println(school);
        System.out.println("------------------");
        System.out.println("Danh sách khối: ");
        unitManagement.add(new Unit("khoi 1", 1, 6));
        unitManagement.add(new Unit("khoi 2", 2, 7));
        unitManagement.add(new Unit("khoi 3", 3, 8));
        unitManagement.display();
        System.out.println("------------------");
        System.out.println("_____Danh sách lớp_____ ");
       Class clazz1=new Class(1, "C001");
        Class clazz2=new Class(2, "C002");
        Class clazz3=new Class(3, "C003");
        classManagement.add(clazz1);
        classManagement.add(clazz2);
        classManagement.add(clazz3);
        classManagement.display();
        System.out.println("------------------");
        System.out.println("_____Danh sách học sinh_____ ");
        Student student1 = new Student(1, "Son", 6, 8);
        Student student4 = new Student(1, "Huy", 6, 6);
        Student student2 = new Student(2, "Hoa", 7, 9);
        Student student3 = new Student(3, "Linh", 8, 10);
        studentManagement.add(student1);
        studentManagement.add(student2);
        studentManagement.add(student3);
        studentManagement.display();
        Map<Student,Class> studentMap = new HashMap<>();
//        studentMap.put(student1,clazz1);
        studentMap.put(student2,clazz2);
        studentMap.put(student3,clazz3);
        studentMap.put(student4,clazz1);
        System.out.println("------------------");
        System.out.println("_____Thông tin học sinh_____ ");
        System.out.println(studentMap);
//        System.out.println("nhập tên học sinh cần tìm: ");
//        String search= scanner.nextLine();
//        studentManagement.findByName(search);
        System.out.println("------------------");
        System.out.println("_____Sắp xếp theo tuổi học sinh_____");
        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        students.forEach(System.out::println);
        System.out.println("------------------");
        System.out.println("nhập tên học sinh cần tìm: ");
        String search= scanner.nextLine();
        studentManagement.findByName(search);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
