//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class DemoObj{
//    int number;
//    String name;
//
//    public DemoObj(int number, String name){
//        this.number = number;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "DemoObj{" +
//                "number=" + number +
//                ", name='" + name + '\''
//                 ;
//    }
//}
//public class Main2 {
//
//    public static void main(String[] args) {
//        DemoObj d1 = new DemoObj(3,"Arpit");
//        DemoObj d2 = new DemoObj(2,"Arjit");
//        System.out.println(d1);
//        System.out.println(d2);
//        //int a = d1.hashCode();
//        //int b = d2.hashCode();
//        ArrayList<DemoObj> arr1 = new ArrayList<DemoObj>();
//        arr1.add(d1);
//        arr1.add(d2);
//
//        Collections.sort(arr1, new Comparator<DemoObj>() {
//            @Override
//            public int compare(DemoObj o1, DemoObj o2) {
//                return 0;
//            }
//        });
//
//
//    }
//}
