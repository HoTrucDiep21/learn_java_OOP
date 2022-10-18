public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        Swap(a, b);
       

    }

    public static void Swap(int a, int b) {
        System.out.println("So can Swap: " + "a=" + a + "b=" + b);
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

    }
    
}
