package com.codecool.uml.overriding;

public class Webshop {
    public static void main(String[] args) {
        Order first = new Order();
        System.out.println("First status: " + first.getStatus());
        first.checkout();
        System.out.println("First status: " + first.getStatus());
        first.pay();
        System.out.println("First status: " + first.getStatus());
        first.checkout();
        System.out.println("First status: " + first.getStatus());
    }
}
