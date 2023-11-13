package com.charactersFactory;

import com.characters.Character;
import com.characters.Elf;
public class ElfFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name, int age, String ability) {
        return new Elf(name, age, ability);
    }
}
