package com.buldings;

public class EuropeanHouseBuilder implements HouseBuilder{

    House house = new House();

    @Override
    public void buildMaterial() {
        house.setMaterial("Concrete");
    }

    @Override
    public void buildRoof() {
        house.setRoofStyle("Pitched");
    }

    @Override
    public void buildPosition(int x, int y) {
        house.setPosition(x, y);
    }

    @Override
    public void buildSize(int width, int length) {
        house.setSize(width, length);
    }

    @Override
    public House getResult() {
        return house;
    }
}
