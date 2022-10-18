import java.util.Scanner;

public class rectangle {
    Scanner sc = new Scanner(System.in);
    float longs;
    float width;

    public void inPut() {
        System.out.println("input longs = ");
        longs = sc.nextFloat();
        System.out.println("Input width = ");
        width = sc.nextFloat();

    }

    public float caculatePerimeter() {
        return ((longs + width) * 2);
    }

    public float caculateArea() {
        return longs * width;
    }
}
