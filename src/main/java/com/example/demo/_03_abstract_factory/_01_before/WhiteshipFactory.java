package com.example.demo._03_abstract_factory._01_before;

import com.example.demo._02_factory_method._02_after.DefaultShipFactory;
import com.example.demo._02_factory_method._02_after.Ship;
import com.example.demo._02_factory_method._02_after.white.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
