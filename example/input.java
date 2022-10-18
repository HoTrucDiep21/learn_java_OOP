import java.util.Scanner;
public class input {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your dream: ");
        String dream = sc.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(dream);
    }

}
