package com.buldings;

public class AsianHouseBuilder implements HouseBuilder{
    House house = new House();

    @Override
    public void buildMaterial() {
        house.setMaterial("Bamboo");
    }

    @Override
    public void buildRoof() {
        house.setRoofStyle("Pagoda");
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
