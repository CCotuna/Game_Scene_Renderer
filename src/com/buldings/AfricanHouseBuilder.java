package com.buldings;

public class AfricanHouseBuilder implements HouseBuilder{
    House house = new House();

    @Override
    public void buildMaterial() {
        house.setMaterial("Cane");
    }

    @Override
    public void buildRoof() {
        house.setRoofStyle("Thatched");
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
