package com.charactersFactory;

import com.characters.Character;
import com.characters.Knight;

public class KnightFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name, int age, String ability) {
        return new Knight(name, age, ability);
    }
}
