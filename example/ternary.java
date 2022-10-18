import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        String result = (marks >= 50) ? "pass" : "fail";

        System.out.println("You "+result+" the exam");

    }
}
