
import java.util.Scanner;

public class circle {
    public static Scanner sc = new Scanner(System.in);
    float radius;

    /**
     * 
     */
    public void input() {
        
        System.out.println("Input radius = ");
        radius = sc.nextFloat();
    }
    public double getPi() {
        return Math.PI;

    }

    public float caculatePerimetr() {
         return (float) (getPi() * Math.pow(radius, 2));
     }

    public float caculateArea() {
        return (float) (getPi() * Math.pow(radius, 2));
    }

}
