package com.buldings;

public class House {

    private String material;
    private String roofStyle;
    private int positionX, positionY, width, length;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRoofStyle() {
        return roofStyle;
    }

    public void setRoofStyle(String roofStyle) {
        this.roofStyle = roofStyle;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getWidth() {
        return width;
    }

    public void setSize(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void render() {
        System.out.println("Rendering house at (" + positionX + ", " + positionY + ")");
    }
}
