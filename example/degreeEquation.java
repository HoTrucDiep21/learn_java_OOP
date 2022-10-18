import java.util.Scanner;
import java.lang.Math;

public class degreeEquation {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c sequence");
        System.out.println("Enter a = ");
        float a = sc.nextFloat();
        System.out.println("Enter b = ");
        float b = sc.nextFloat();
        System.out.println("Enter c = ");
        float c = sc.nextFloat();

        if (a == 0) {
            System.out.println("quadratic equation have 1 roof = " + (-c / b));
        } else {
            float delta = (float) (Math.pow(b, 2) - 4 * a * c);
            if (delta < 0) {
                System.out.println("Complex solution");
            }
            else if (delta == 0) {
                System.out.println("One real solution = " + (-b / 2 * a));
            }
            else if (delta > 0) {
                System.out.println("Two real solution x1, x2");
                System.out.println("X1 = " + (-b + Math.sqrt(delta) / 2 * a));
                System.out.println("x2 = "+(-b - Math.sqrt(delta)/2*a));
            }
        }

    }
}
