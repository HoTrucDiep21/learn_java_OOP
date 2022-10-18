import java.util.Scanner;
public class tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x =  ");

        int x = sc.nextInt();
        System.out.print("Enetr y = ");
        int y = sc.nextInt();

        try {
            int result = x / y;
            System.out.println("result = "+result);

        } catch (Exception e) {
            System.out.println("Can not devide by number 0 ");
        }
        finally{
            System.out.println("finish");
        }

    }
}
