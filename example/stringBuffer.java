import java.util.Scanner;

public class stringBuffer {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println(sb);
        sb.insert(7, "i'm ");
        System.out.println(sb);
        sb.delete(7, 8);
        System.out.println(sb);
        

    }
    
}
