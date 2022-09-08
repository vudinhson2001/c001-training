import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoThuatToan {
    public static void main(String[] args) {
        int hocSinh[] = {1, 4, 7, 3, 5};
//        Arrays.sort(hocSinh);
////        System.out.println(hocSinh[hocSinh.length-2]);
//        int max1=hocSinh[0];
//        int max2= hocSinh[0];
//        for (int i = 0; i < hocSinh.length; i++) {
//                if (max1<hocSinh[i]){
//                    max2=max1;
//                    max1=hocSinh[i];
//            } else if (hocSinh[i]>max2) {
//                    max2=hocSinh[i];
//                }
//        }
//        System.out.println("max2 =" +max2);
//        System.out.println("max1 =" +max1);
        int max = hocSinh[0];
        for (int i = 0; i < hocSinh.length; i++) {
          if (max<hocSinh[i]){
              max=hocSinh[i];
          }
        }
        System.out.println("max =" + max);
    }
}

