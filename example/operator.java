import javax.rmi.CORBA.Stub;

public class operator {
    public static void main(String[] args) {
        double a = 6.7d;
        double b = 15.6d;

        float sum = (float) (a + b);
        int subtraction = (int) (a - b);
        float multiplicatio = (float) (a * b);
        float division = (float) (a / b);

        System.out.println("Sum =" + sum);
        System.out.println("suntraction = " + subtraction);
        System.out.println("Multiplication = " + multiplicatio);
        System.out.println("Divsion = " + division);

    }
}
