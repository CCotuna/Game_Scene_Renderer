package com.characters;

public class Wizard implements Character{
    private String name;
    private int age;
    private String ability;
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Wizard(String name, int age, String ability) {
        this.name = name;
        this.age = age;
        this. ability = ability;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Wizard " + name + " moved to (" + x + ", " + y + ")");
    }

    @Override
    public void render() {
        System.out.println("Rendering Wizard " + name + ", age - " + age + ", ability - "+  ability +" - at (" + x + ", " + y + ")");
    }
}
