package com.groups;

import com.characters.Character;
import java.util.ArrayList;

public class SmallGroup implements BaseGroup{
    private ArrayList<Character> members = new ArrayList<>();

    public void addMember(Character character) {
        members.add(character);
    }

    public void removeMember(Character character) {
        members.remove(character);
    }
    @Override
    public void moveTo(int x, int y) {
        for(Character member : members) {
            member.moveTo(x, y);
        }
    }

    @Override
    public void render() {
        System.out.println();
        System.out.println("Rendering Small Group: ");
        for(Character member : members) {
            member.render();
        }
    }
}
