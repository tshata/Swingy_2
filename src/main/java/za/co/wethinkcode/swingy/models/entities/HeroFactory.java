package za.co.wethinkcode.swingy.models.entities;

import za.co.wethinkcode.swingy.models.artefacts.Artefact;

public class HeroFactory {
    private static String name;
    private static String rank;
    private static int level;
    private static int attack;
    private static int defence;
    private static int hitPoints;
    private static Artefact artefact;
    private static int id;

    public static Entity newHero(String name, String rank, int level, int attack, int defence, int hitPoints, Artefact artefact, int id){

        HeroFactory.name = name;
        HeroFactory.rank = rank;
        HeroFactory.level = level;
        HeroFactory.attack = attack;
        HeroFactory.defence = defence;
        HeroFactory.hitPoints = hitPoints;
        HeroFactory.artefact = artefact;
        HeroFactory.id = id;
    }}
