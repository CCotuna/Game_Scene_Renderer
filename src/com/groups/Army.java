package com.groups;

import com.characters.Character;

import java.util.ArrayList;

public class Army implements BaseGroup{

    private ArrayList<BaseGroup> legions = new ArrayList<>();

    public void addLegion(BaseGroup legion) {
        legions.add(legion);
    }

    public void removeLegion(BaseGroup legion){
        legions.remove(legion);
    }
    @Override
    public void moveTo(int x, int y) {
        for(BaseGroup legion : legions) {
            legion.moveTo(x, y);
        }
    }

    @Override
    public void render() {
        System.out.println();
        System.out.println("Rendering Army: ");
        for(BaseGroup legion : legions) {
            legion.render();
        }
    }
}
