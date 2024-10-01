package com.loosemole.commonclass;

import java.util.ArrayList;
import java.util.List;

public class PlayerClass {
    private String name;
    private String desc;
    private ArrayList<ClassLevel> levels;

    public PlayerClass(String name) {  // Placeholder constructor, only assigning name.
        this.name = name;
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
}
