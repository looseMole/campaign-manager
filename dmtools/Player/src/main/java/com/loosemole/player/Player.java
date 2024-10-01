package com.loosemole.player;

import com.loosemole.common.dice.DiceTypes;
import com.loosemole.commonrace.PlayerRace;
import com.loosemole.common.character.AbilityScores;
import com.loosemole.commonclass.PlayerClass;
import com.loosemole.common.character.Alignments;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class Player {
    private String name;
    private HashMap<PlayerClass, Integer> classesMap = new HashMap<>();
    private PlayerRace pRace;
    private HashMap<Enum<AbilityScores>, Integer> abilityScoreMap = new HashMap<>();
    private Enum<Alignments> alignment;
    private int profBonus = 0;
    private int inspiration = 0;
    private int armorClass = 10;
    private int initiativeBonus = 0;
    private int hp = 10;
    private int speed = 30;

    /*
    Minimal constructor for a Player object. Not recommended for use in production.
     */
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
    Factory pattern constructor for a Player object. Recommended for use in production.
     */
    // TODO: Implement factory pattern for Player object creation

    /*
    Should be used to calculate stats like start HP & AC, based on Player's ability scores.
     */
    private void calculateStats() {
        // Base HP
        DiceTypes hitdie = DiceTypes.D10; // TODO get hit-die from player's first class

        /*
        5e starting hp is calculated with the formula <hit dice max>+(CON-10)/2, rounded down.
         */
        this.hp = switch (hitdie) {
            case D6 -> 6 + this.asModifier(AbilityScores.CON);
            case D8 -> 8 + this.asModifier(AbilityScores.CON);
            case D10 -> 10 + this.asModifier(AbilityScores.CON);
            default -> 12 + this.asModifier(AbilityScores.CON); // Treated as D12
        };

        // Armor Class
        this.armorClass = 10 + this.asModifier(AbilityScores.DEX);

        // Initiative
        this.initiativeBonus = 10 + this.asModifier(AbilityScores.DEX);
    }

    private int asModifier(AbilityScores abilityScore) {
        return (abilityScoreMap.get(abilityScore) - 10) / 2;
    }

    public static void main(String[] args) {
        // System.out.println("Hello World!");
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

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public Map<Enum<AbilityScores>, Integer> getAbilityScoreMap() {
        return abilityScoreMap;
    }

    public void setAbilityScoreMap(HashMap<Enum<AbilityScores>, Integer> abilityScoreMap) {
        this.abilityScoreMap = abilityScoreMap;
    }

    public Map<PlayerClass, Integer> getClassesMap() {
        return classesMap;
    }

    public void setClassesMap(HashMap<PlayerClass, Integer> classesMap) {
        this.classesMap = classesMap;
    }
}
