package com.loosemole.player;

import com.loosemole.common.dice.DiceTypes;
import com.loosemole.commonrace.PlayerRace;
import com.loosemole.common.character.AbilityScores;
import com.loosemole.commonclass.PlayerClass;
import com.loosemole.common.character.Alignments;

import java.util.HashMap;

/**
 * Hello world!
 */
public class Player {
    private String name;
    private HashMap<PlayerClass, Integer> classesMap = new HashMap<PlayerClass, Integer>();
    private PlayerRace pRace;
    private HashMap<Enum<AbilityScores>, Integer> abilityScoreMap = new HashMap<Enum<AbilityScores>, Integer>();
    private Enum<Alignments> alignment;
    private int profBonus = 0;
    private int inspiration = 0;
    private int armorClass = 10;
    private int initiativeBonus = 0;
    private int HP = 10;
    private int speed = 30;

    public Player(String name) {
        this.name = name;
        this.alignment = Alignments.NN;
        this.abilityScoreMap.put(AbilityScores.STR, 10);
        this.abilityScoreMap.put(AbilityScores.DEX, 10);
        this.abilityScoreMap.put(AbilityScores.CON, 10);
        this.abilityScoreMap.put(AbilityScores.INT, 10);
        this.abilityScoreMap.put(AbilityScores.WIS, 10);
        this.abilityScoreMap.put(AbilityScores.CHA, 10);
        this.classesMap.put(new PlayerClass("Fighter"), 1);
        this.calculateStats();
    }

    /*
    Should be used to calculate stats like start HP & AC, based on Player's ability scores.
     */
    private void calculateStats() {
        // Base HP
        DiceTypes hitdie = DiceTypes.D10; // TODO get hit-die from player's first class
        int hp;
        /*
        5e starting hp is calculated with the formula <hitdie-max>(CON-10)/2, rounded down.
         */
        switch (hitdie) {
            case D6:
                hp = 6 + this.asModifier(AbilityScores.CON);
            case D8:
                hp = 8 + this.asModifier(AbilityScores.CON);
            case D10:
                hp = 10 + this.asModifier(AbilityScores.CON);
            default: // Treated as D12
                hp = 12 + this.asModifier(AbilityScores.CON);
        }
        this.HP = hp;

        // Armor Class
        this.armorClass = 10 + this.asModifier(AbilityScores.DEX);

        // Initiative
        this.initiativeBonus = 10 + this.asModifier(AbilityScores.DEX);
    }

    private int asModifier(AbilityScores abilityScore) {
        return (abilityScoreMap.get(abilityScore) - 10) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int getProfBonus() {
        return profBonus;
    }

    public void setProfBonus(int profBonus) {
        this.profBonus = profBonus;
    }

    public int getInspiration() {
        return inspiration;
    }

    public void setInspiration(int inspiration) {
        this.inspiration = inspiration;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getInitiativeBonus() {
        return initiativeBonus;
    }

    public void setInitiativeBonus(int initiativeBonus) {
        this.initiativeBonus = initiativeBonus;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerRace getpRace() {
        return pRace;
    }

    public void setpRace(PlayerRace pRace) {
        this.pRace = pRace;
    }

    public Enum<Alignments> getAlignment() {
        return alignment;
    }

    public void setAlignment(Enum<Alignments> alignment) {
        this.alignment = alignment;
    }

    public HashMap<Enum<AbilityScores>, Integer> getAbilityScoreMap() {
        return abilityScoreMap;
    }

    public void setAbilityScoreMap(HashMap<Enum<AbilityScores>, Integer> abilityScoreMap) {
        this.abilityScoreMap = abilityScoreMap;
    }

    public HashMap<PlayerClass, Integer> getClassesMap() {
        return classesMap;
    }

    public void setClassesMap(HashMap<PlayerClass, Integer> classesMap) {
        this.classesMap = classesMap;
    }
}
