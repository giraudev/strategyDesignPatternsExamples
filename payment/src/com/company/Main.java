package com.company;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("1111", 20);
        Item item3 = new Item("2222", 30);
        Item item4 = new Item("3333", 40);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

        cart.pay(new PaypalStrategy("myemail@email.com", "password"));

        cart.pay(new CreditCardStrategy("nome", "12344553333", "123", "12/05"));

    }
}
