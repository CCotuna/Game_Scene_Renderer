package com.characters;

public interface Character {

    int getX();
    int getY();
    void moveTo(int x, int y);
    void render();
}
