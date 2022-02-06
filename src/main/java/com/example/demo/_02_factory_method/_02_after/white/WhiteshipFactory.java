package com.example.demo._02_factory_method._02_after.white;

import com.example.demo._02_factory_method._02_after.DefaultShipFactory;
import com.example.demo._02_factory_method._02_after.Ship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
