package com.example.demo._02_factory_method._02_after;

import com.example.demo._02_factory_method._02_after.black.BlackshipFactory;
import com.example.demo._02_factory_method._02_after.white.WhiteshipFactory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");
        client.print(new BlackshipFactory(), "blackship", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
