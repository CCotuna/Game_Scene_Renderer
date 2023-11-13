package com.game;

import com.buldings.House;
import com.characters.Character;
import com.groups.BaseGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoardGame {
    private ArrayList<Character> characters;
    private ArrayList<BaseGroup> groups;
    private ArrayList<House> houses;
    private Map<Object, int[]> objectPositions;

    private int boardWidth;
    private int boardLength;

    public BoardGame(int boardWidth, int boardLength) {
        this.boardWidth = boardWidth;
        this.boardLength = boardLength;
        characters = new ArrayList<>();
        groups = new ArrayList<>();
        houses = new ArrayList<>();
        objectPositions = new HashMap<>();
    }

    public void addCharacter(Character character, int x, int y) {
        if(isValidPosition(x, y)){
            characters.add(character);
            objectPositions.put(character, new int[]{0,0});
        }else {
            System.out.println("Invalid position for character.");
        }
    }

    public void addGroup(BaseGroup group, int x, int y){
        groups.add(group);
        objectPositions.put(group, new int[]{0,0});
    }

    public void addHouse(House house, int x, int y){
        if(isValidPosition(x, y)){
            houses.add(house);
            objectPositions.put(house, new int[]{x, y});
        }else{
            System.out.println("Invalid position for house.");
        }
    }

    private boolean isValidPosition(int x, int y){
        return x>= 0 && x < boardWidth && y >= 0 && y < boardLength;
    }

    public void render(){
        System.out.println();
        System.out.println("Rendering Board Game: ");

        System.out.println("Characters: ");
        for(Character character : characters) {
            int[] position = objectPositions.get(character);
            System.out.println(" - " + character.getClass().getSimpleName() +
                    " at (" + position[0] + ", " + position[1] + ")");
        }
        System.out.println();
        System.out.println("Groups: ");
        for (BaseGroup group : groups){
            group.render();
        }
        System.out.println();
        System.out.println("Houses: ");
        for(House house: houses){
            int[] position = objectPositions.get(house);
            System.out.println(" - " + house.getClass().getSimpleName() +
                    " at (" + position[0] + ", " + position[1] + ")");
        }
        System.out.println();
    }
}
