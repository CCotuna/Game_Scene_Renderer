package com.charactersFactory;

import com.characters.Character;
import com.characters.Wizard;
public class WizardFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name, int age, String ability) {
        return new Wizard(name, age, ability);
    }
}
