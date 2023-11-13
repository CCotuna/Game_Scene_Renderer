package com.groups;

import com.characters.Character;

import java.util.ArrayList;

public class Legion implements BaseGroup{
    private ArrayList<BaseGroup> groups = new ArrayList<>();

    public void addGroup(BaseGroup group) {
        groups.add(group);
    }

    public void removeGroup(BaseGroup group) {
        groups.remove(group);
    }

    @Override
    public void moveTo(int x, int y) {
        for(BaseGroup group : groups) {
            group.moveTo(x, y);
        }
    }

    @Override
    public void render() {
        System.out.println();
        System.out.println("Rendering Legion: ");
        for(BaseGroup group : groups) {
            group.render();
        }
    }
}
