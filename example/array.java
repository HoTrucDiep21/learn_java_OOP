import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array {
    public static Scanner sc = new Scanner(System.in);

    // public static void main(String[] args) {
    //     System.out.print("Enter amount element for Array =  ");
    //     int n = sc.nextInt();

    //     int[] arr = new int[n];
    //     enter(arr, n);
    //     export(arr);

    // }

    // public static void enter(int[] arr, int n) {
    //     for (int i = 0; i < n; i++) {
    //         System.out.printf("a[%d] = ", i);
    //         arr[i] = sc.nextInt();
    //     }
    // }
    // private static void export(int[] arr) {
    //     System.out.println("Data of element of Array");
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] +" ");
    //     }
    // }
// ===============Array===========================
    // public static void main(String[] args) {

    //     System.out.println("Enter element of Array = ");
    //     int n = sc.nextInt();
    //     int[] a = new int[n];

    //     System.out.println("========Input========");
    //     inPut(a, n);
    //     System.out.println("==========Output==========");
    //     outPut(a, n);

    // }

    // public static void inPut(int[] a, int n) {
    //     for (int i = 0; i < a.length; i++) {
    //         System.out.printf("a[%d] = ", i);
    //         a[i] = sc.nextInt();
    //     }
    // }

    // public static void outPut(int[] a, int n) {
    //     for (int i = 0; i < a.length; i++) {
    //         System.out.print(a[i] + " ");
    //     }
    // }
    // ======================ArrayList========================
    public static void main(String[] args) {
        inPutArrayList();

    }

    public static void inPutArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("JavaCrips");

        System.out.println("These element in ArrayList: ");
        // System.out.println(list);

        // Su dung vong lap for 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // Su dung vong l;ap cai tien
        for (String str : list) {
            System.out.println(str);
        }
        // ======used method : addAll, retailAll, removeAll=====
        // ===1. used addAll
        System.out.println("============addAll============");
        ArrayList<String> listA = new ArrayList<>();
        listA.addAll(list);
        System.out.println("list A");
        System.out.println(listA);

        System.out.println("==============retaiAll=================");
        ArrayList<String> listB = new ArrayList<>();
        listB.add("Fuck money");
        listB.add("JavaCrips");
        // remove element not belong listB from listA
        listA.retainAll(listB);
        System.out.println("list A");
        System.out.println(listA);
        System.out.println(listB);
        System.out.println("=================remove All====================");
        list.removeAll(listB);
        System.out.println(list);
        System.out.println(listA);
        System.out.println(listB);



    }
    
    
    
}
