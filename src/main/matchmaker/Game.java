package main.matchmaker;
/*
 * This class is used to represent a single game (after successful matchmaking).
 * It contains the list of players in the game, the map being played and the average skill level
 */

import java.util.Arrays;


public class Game
{
    //member variables
    String[] userNames = new String[10];    //Should I use Player objects or just usernames?
    String map;
    Integer[] skillLevels = new Integer[10];
    double avgSkillLevel;
    
    //Constructor
    public Game(String[] userNames, String map, Integer[] skillLevels)
    {
        this.userNames = userNames;
        this.map = map;
        this.skillLevels = skillLevels;
        
        //Calculating average skill level
        int sum = 0;
        for(int temp: skillLevels)
            sum += temp;
        
        this.avgSkillLevel = sum*1.0/10;
    }
}
