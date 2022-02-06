package com.example.demo._03_abstract_factory._02_after;

import com.example.demo._02_factory_method._02_after.DefaultShipFactory;
import com.example.demo._02_factory_method._02_after.Ship;
import com.example.demo._02_factory_method._02_after.white.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
