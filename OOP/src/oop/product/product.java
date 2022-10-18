package oop.product;

import java.util.Scanner;

public class product {
    private String goodsCode, goodsName;
    private float amount;
    private float price;

    public product() {
    }

    public product(String goodsCode, String goodsName, float amount, float price) {
        this.goodsCode = goodsCode;
        this.goodsName = goodsName;
        this.amount = amount;
        this.price = price;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input goodsCode: ");
        goodsCode = sc.nextLine();
        System.out.println("Input goodsName: ");
        goodsName = sc.nextLine();
        System.out.println("Input goods of amount: ");
        amount = sc.nextFloat();
        System.out.println("Input price: ");
        price = sc.nextFloat();

    }

    public void display() {
        System.out.println("goods Code: " + this.goodsCode);
        System.out.println("Goods Name: " + this.goodsName);
        System.out.println("Goods of Amount: " + this.amount);
        System.out.println("Goods of Price: " + this.price);

    }

}
