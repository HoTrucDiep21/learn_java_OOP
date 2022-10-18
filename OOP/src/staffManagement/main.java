package staffManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static List<cadres> cadresList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    inutData();

                    break;
                case 2:
                    searchByName();

                    break;
                case 3:
                    displayInformation();
                    break;
                case 0:
                    System.out.println("Exit!!!");
                    break;

                default:
                    System.out.println("Input incorrect!!");
                    break;
            }

        } while (choose != 0);

    }

    static void inutData() {
        System.out.println("Enter the number of cadres to add: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            cadres cd = createCadres();
            cadresList.add(cd);

        }

    }

    static cadres createCadres() {
        cadres cd = null;
        System.out.println("1. Input information of Worker");
        System.out.println("2. Input information of Engineer");
        System.out.println("3.Input information of Service Staff");
        System.out.println("input choose: ");

        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                cd = new worker();
                break;
            case 2:
                cd = new engineer();

                break;
            case 3:
                cd = new serviceStaff();
                break;

        }
        cd.inPut();
        return cd;

    }

    static void searchByName() {
        System.out.println("Input cadres need Search: ");
        String name = sc.nextLine();

        cadresList.forEach((cd) -> {
            if (cd.getName().equalsIgnoreCase(name)) {
                cd.disPlay();
            }
        });
    }

    /**
     *
     */
    static void displayInformation() {
        cadresList.forEach((cd) -> {
            cd.disPlay();
        });
    }

    static void showMenu() {
        System.out.println("1. Input new information for Cadres");
        System.out.println("2. Search by name");
        System.out.println("3. Display Information");
        System.out.println("0. Exit");
        System.out.println("input choose: ");

    }
}
