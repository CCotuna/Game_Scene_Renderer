package com.characters;

public class Elf implements Character {
    private String name;
    private int age;
    private String ability;
    private int x;
    private int y;

    public Elf(String name, int age, String ability) {
        this.name = name;
        this.age = age;
        this.ability = ability;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Elf " + name + " moved to (" + x + ", " + y + ")");
    }

    @Override
    public void render() {
        System.out.println("Rendering Elf " + name + ", age - " + age + ", ability - "+  ability +" - at (" + x + ", " + y + ")");
    }
}
