package com.company;


public class Main {

    public static void main(String[] args) {

        Consumation hamburger = new Hamburger();
        System.out.println("Product:" +
                hamburger.productName +
                " price " + String.format("%.2f", hamburger.getPrice()
        ));

        Consumation cheeseburger = new CheeseBurger();


        Consumation hamburgerWithMai = new ExtraMaioneseDecorator(hamburger);
        System.out.println("Product:" +  hamburgerWithMai.getProductName() +
                " price " + String.format("%.2f", hamburgerWithMai.getPrice()));

        Consumation hamburgerMaiKetch = new ExtraKetchupDecorator(new ExtraMaioneseDecorator(hamburger));
        System.out.println("Product:" +
                hamburgerMaiKetch.getProductName() +
                " price " + String.format("%.2f", hamburgerMaiKetch.getPrice()));

        Consumation cheeseburgerwithMai = new ExtraMaioneseDecorator(cheeseburger);
        System.out.println("Product:" +
                cheeseburgerwithMai.getProductName() +
                " price " + String.format("%.2f", cheeseburgerwithMai.getPrice()));

    }
}
