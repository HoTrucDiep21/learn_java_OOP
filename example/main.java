import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. perimeter and area of Circle");
        System.out.println("2. perimeter and are of rectangle");
        System.out.println("3. perimeter and area of Square");
        System.out.println("===========end===========");
        System.out.println("Enter choose: ");
        int choose = sc.nextInt();

        switch (choose) {
            
            case 1:
                System.out.println("Enter radius of Circle: ");
                float radius = sc.nextFloat();
                System.out.println("perimeter of Circle = " + circle.perimeterCircle(radius));
                System.out.println("area of Circle = "+ circle.areaCircle(radius));
                break;
            case 2:
                System.out.print("Enter longs of Rectangle:");
                float longs = sc.nextFloat();
                System.out.print("Enter width of Rectangle:");
                float width = sc.nextFloat();
                System.out.print("perimeter of Rectangle = " + rectangle.perimeterRectangle(longs, width));
                System.out.println("area of Rectangle = " + rectangle.areaRectangle(longs, width));
                break;
            case 3:
                System.out.println("Enter edge of Square = ");
                float edge = sc.nextFloat();
                System.out.println("perimetr of Square = " + squara.perimeterSquare(edge));
                System.out.println("area of Square = " + squara.areaSquare(edge));
                break;
        
            default:
                break;
        }
        

    }
}
