import java.util.Scanner;



public class square {
    public static Scanner sc = new Scanner(System.in);
    float edge;

    public void inPut() {
        System.out.println("Input edges = ");
        edge = sc.nextFloat();

    }

    public float caculatePerimetr() {
        return edge * 4;
    }

    public float caculateArea() {
        return edge * edge;
    }
}
