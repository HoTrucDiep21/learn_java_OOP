import java.util.Scanner;

public class testAnimal {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // animal anl;
        // anl = new cat();
        // anl = new dog();
        // if (anl instanceof dog) {
        //     ((dog) anl).showSound();
        //     System.out.println("meo");
        // } else if (anl instanceof cat) {
        //     ((cat) anl).showSound();
        // }
        // cat ct = new cat();
        // ct.running();

        dog dog1 = new dog();
        dog1.amThanh();
        cat cat1 = new cat();
        cat1.amThanh();

    }
}
