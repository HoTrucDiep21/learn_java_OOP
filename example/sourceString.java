import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sourceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input source String: ");
        String sourceStr = new String();
        sourceStr = sc.nextLine();
        System.out.println("Input search String: ");
        String searchString = new String();
        searchString = sc.nextLine();
        // Tim kiem vi tri va so lan xuat hien 
        // C1: Khong toi uu
        System.out.println("=========Search in String and appear===========");
        System.out.println("======== First way ======");
        System.out.println();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sourceStr.length(); i++) {
            int index = sourceStr.indexOf(searchString, i);
            if (index >= 0 && !list.contains(index) ) {
                count++;
                list.add(index);
                System.out.println("index = "+index);
            }
        } 
        System.out.println("Count: " + count);
        
        System.out.println("========= second way ===========");
        count = 0;
        for (int i = 0; i < sourceStr.length();) {
            int index = sourceStr.indexOf(searchString, i);
            if (index >= 0) {
                count++;
                i = index + 1;
                System.out.println("index: "+index);

            }else{
                break;
            }
        }
        System.out.println("count: " +count);

    }
}
