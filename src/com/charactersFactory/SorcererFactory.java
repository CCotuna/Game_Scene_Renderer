package com.charactersFactory;

import com.characters.Character;
import com.characters.Sorcerer;
public class SorcererFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name, int age, String ability) {
        return new Sorcerer(name, age, ability);
    }
}
