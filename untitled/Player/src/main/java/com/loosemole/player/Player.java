package com.loosemole.player;

import com.loosemole.commonrace.PlayerRace;
import com.loosemole.dmtools.character.AbilityScores;
import com.loosemole.commonclass.PlayerClass;
import com.loosemole.dmtools.character.Alignments;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class Player
{
    private String name;
    private HashMap<PlayerClass, Integer> classesMap = new HashMap<PlayerClass, Integer>();
    private PlayerRace pRace;
    private HashMap<Enum<AbilityScores>, Integer> abilityScoreMap = new HashMap<Enum<AbilityScores>, Integer>();
    private Enum<Alignments> alignment;
    private int profBonus = 0;
    private int inspiration = 0;
    private int armorClass = 10; // TODO: Calculate AC from base dex
    private int initiative = 0; // TODO: Calculate base ini
    private int HP = 10; // TODO: Calculate base HP
    private int speed = 30;

    public Player(String name) {
        this.name = name;
        this.alignment = Alignments.NN;
        this.abilityScoreMap.put(AbilityScores.STRENGTH, 10);
        this.abilityScoreMap.put(AbilityScores.DEXTERITY, 10);
        this.abilityScoreMap.put(AbilityScores.CONSTITUTION, 10);
        this.abilityScoreMap.put(AbilityScores.INTELLIGENCE, 10);
        this.abilityScoreMap.put(AbilityScores.WISDOM, 10);
        this.abilityScoreMap.put(AbilityScores.CHARISMA, 10);
        this.classesMap.put(new PlayerClass("Fighter"), 1);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
