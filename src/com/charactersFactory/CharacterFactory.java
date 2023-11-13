package com.charactersFactory;

import com.characters.Character;

public interface CharacterFactory {
    Character createCharacter(String name, int age, String ability);
}
