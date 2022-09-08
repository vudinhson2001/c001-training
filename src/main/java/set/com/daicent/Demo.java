package set.com.daicent;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Demo {
    //    public static void main(String[] args) {
//
//        int point;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("------------");
//            System.out.println("so can doc");
//            point = scanner.nextInt();
//            if (point < 5) {
//                System.out.println("kém");
//            } else if (point == 5) {
//                System.out.println("trung binh");
//            } else if (point > 5 && point < 10) {
//                System.out.println("giỏi");
//            }else if (point>10){
//                System.err.println("nhap lai");
//            }
//        } while (true);
//    }
//
    public static void main(String[] args) {
        HocSinh hocSinh1 = new HocSinh("Son1",1,234);
        HocSinh hocSinh2 = new HocSinh("Son1",1,234);
        HocSinh hocSinh3 = new HocSinh("Son3",3,2346);
        HocSinh hocSinh4 = new HocSinh("Son4",4,2347);
        Set<HocSinh> hocSinhSet = new HashSet<HocSinh>();
       hocSinhSet.add(hocSinh1);
       hocSinhSet.add(hocSinh2);
       hocSinhSet.add(hocSinh3);
       hocSinhSet.add(hocSinh4);
        System.out.println(hocSinhSet.size());
    }
}
