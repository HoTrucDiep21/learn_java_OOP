public class function {
    public static void main(String[] args) {
        int a = 5, b = 6;
        int sum = sum(a, b);
        System.out.println("Sum = " + sum);
        idealOfLife();
        date();
        System.out.println("==========");
        double darius = 5.6f;
        float perimeter = (float) (pi() * darius);
        System.out.println("perimeter of circle =" + perimeter);
        System.out.println("======find smallest number=======");
        smallestNumber(5, 6, 7);


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void idealOfLife() {
        System.out.println("Let's die empty.");
    }

    public static void date() {
        int n = 1;
        while (n == 1) {
            System.out.println("Monday");
            System.out.println("Tuesday");
            System.out.println("Wednesday");
            System.out.println("Thursday");
            System.out.println("Friday");
            System.out.println("Saturday");
            System.out.println("Sunday");
            ++n;
        }
    }
    
    public static float pi() {
        return 3.14f;
    }
    //Java method exsercise
    // ex1: Write a Java method to find the smallest number among three number
    public static void smallestNumber(int a, int b, int c) {
        int min = a;
        if (min < b && b < c) {
            System.out.println("Smallest number = " + min);
            return;

        }
        else if (min > b && b < c) {

            System.out.println("Smallest number = " + b);
            return;
        }
        else if (min > b && b > c) {
            System.out.println("Smallest number  = " + c);
            return;
        }
        else if (min == b && b == c) {
            System.out.println("Smallest number = " + min);
            return;
        }
    }  
}
