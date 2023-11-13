package com.buldings;

public interface HouseBuilder {
    void buildMaterial();
    void buildRoof();
    void buildPosition(int x, int y);
    void buildSize(int width, int length);
    House getResult();
}
