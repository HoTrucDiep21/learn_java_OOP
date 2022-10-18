import java.lang.String;
public class string {
    public static void main(String[] args) {
        String str = "LeWissDang";
        System.out.println("index W: " + str.indexOf('W'));
        System.out.println("Length: " + str.length());
        System.out.println("Last: " + str.lastIndexOf('W'));
        
        String str1 = "   Hello ";
        System.out.println(str1);
        System.out.println(str1.trim());

        String nums = "0325632452";
        String[] params = nums.split("63");
        for (String param : params) {
            System.out.println(param);
        }

        
    }
}
