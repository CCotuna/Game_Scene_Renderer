package com.game;

import com.characters.Character;
import com.groups.*;
import com.charactersFactory.*;
import com.buldings.*;

public class MainGame {
    public static void main(String[] args){
        CharacterFactory humanFactory = new HumanFactory();
        Character human = humanFactory.createCharacter("Bruno", 25, "Laziness");
        Character human2 = humanFactory.createCharacter("Richard", 35, "Laziness x 2");

        CharacterFactory knightFactory = new KnightFactory();
        Character knight = knightFactory.createCharacter("Sir L", 50, "Agility");

        CharacterFactory wizardFactory = new WizardFactory();
        Character wizard = wizardFactory.createCharacter("Choco", 180, "Teleportation");

        human.moveTo(5,5);
        knight.moveTo(19, 20);
        wizard.moveTo(12, 24);
//        human.render();
        wizard.render();

        SmallGroup smallGroup = new SmallGroup();
        smallGroup.addMember(human);
        smallGroup.addMember(human2);

        SmallGroup small2Group = new SmallGroup();
        small2Group.addMember(knight);

        smallGroup.moveTo(8,6);
//        smallGroup.render();

        small2Group.render();

        Legion newLegion = new Legion();
        newLegion.addGroup(smallGroup);
        newLegion.addGroup(small2Group);

        newLegion.moveTo(38,38);
        newLegion.render();


        BoardGame boardGame = new BoardGame(30,30);

        HouseBuilder europeanHouseBuilder = new EuropeanHouseBuilder();
        europeanHouseBuilder.buildMaterial();
        europeanHouseBuilder.buildRoof();
        europeanHouseBuilder.buildPosition(29,25);
        europeanHouseBuilder.buildSize(5,7);

        House europeanHouse = europeanHouseBuilder.getResult();
        boardGame.addHouse(europeanHouse, europeanHouse.getPositionX(),europeanHouse.getPositionY());

//      europeanHouse.render();


        boardGame.render();
    }
}
