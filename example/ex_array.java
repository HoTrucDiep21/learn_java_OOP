import java.util.Scanner;
public class ex_array {
    public static Scanner sc = new Scanner(System.in);
   
    // Nhap mang
    public static void inPut(int[] a, int n) {
        // System.out.println("Input amount element for Array:  ");
        // n = sc.nextInt();
        System.out.println("Input data for Array");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
    }
    public static void outPut(int[] a, int n) {
        System.out.println("Data of Array :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
         System.out.println("Input element for Array = ");
        int n = new int();
        
        int[] a = new int[n];
        inPut(a, n);
        outPut(a, n);
        
    }
}
