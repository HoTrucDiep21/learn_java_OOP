package oop.product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input goods of amount: ");
        int n = Integer.parseInt(sc.nextLine());
        product[] productList = new product[n];
        for (int i = 0; i < n; i++) {
            productList[i] = new product();
            productList[i].input();
        }


        int indexMax = 0; 
        for (int i = 0; i < n; i++) {

            if (productList[i].getPrice() > productList[indexMax].getPrice()) {
                indexMax = i;
            }
        }
        productList[indexMax].display();


    }

}