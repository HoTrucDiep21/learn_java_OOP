import java.util.Scanner;

public class mainShape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle cir = new circle();
        rectangle rec = new rectangle();
        square sqr = new square();
        int choose;

        do {
            showmenu();
            System.out.println("Input choose = ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    cir.input();
                    System.out.println(cir.caculatePerimetr());
                    break;
                case 2:
                    rec.inPut();
                    System.out.println(cir.caculateArea());
                    break;
                case 3:
                    rec.inPut();
                    System.out.println(rec.caculatePerimeter());
                    break;
                case 4:
                    rec.inPut();
                    System.out.println(rec.caculateArea());
                    break;
                case 5:
                    sqr.inPut();
                    System.out.println(sqr.caculatePerimetr());
                    break;
                case 6:
                    sqr.inPut();
                    System.out.println(sqr.caculateArea());
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Error");
                    break;
            }

        } while (choose != 7);

    }

    public static void showmenu() {
        System.out.println("1. Caculate perimeter Circle");
        System.out.println("2. Caculate area Circle");
        System.out.println("3. Caculate perimeter Rectangle");
        System.out.println("4. caculateArea Rectangle");
        System.out.println("5. caculatePerimeter Square");
        System.out.println("6. caculateArea Square");
        System.out.println("0. Exit");
    }
}
