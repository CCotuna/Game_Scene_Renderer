package com.charactersFactory;

import com.characters.Character;
import com.characters.Human;

public class HumanFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name, int age, String ability) {
        return new Human(name, age, ability);
    }
}
