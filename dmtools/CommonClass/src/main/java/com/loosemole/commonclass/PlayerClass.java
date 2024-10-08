package com.loosemole.commonclass;

import com.loosemole.common.dice.DiceTypes;

import java.util.ArrayList;
import java.util.List;

public class PlayerClass {
    private String name;
    private String desc;
    private ArrayList<ClassLevel> levels;
    private DiceTypes hitDie;

    public PlayerClass(String name, DiceTypes hitDie) {  // Placeholder constructor, only assigning name.
        this.name = name;
        this.hitDie = hitDie;
        // TODO make proper constructors for PlayerClass
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<ClassLevel> getLevels() {
        return levels;
    }

    public void setLevels(ArrayList<ClassLevel> levels) {
        this.levels = levels;
    }

    public DiceTypes getHitDie() {
        return this.hitDie;
    }
}
