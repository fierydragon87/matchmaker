package main.matchmaker;

/*
 * This class will contain information regarding the player who has joined the competitive queue
 * in CS:GO
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Player 
{
    //member variables
    String userName;
    int skillLevel; //Higher numbers will mean more skilled players
    int ping;   //in ms
    ArrayList<String> maps;
    
    //Constructor
    public Player(String name, int skill, int ping, String[] maps)
    {
        this.userName = name;
        this.skillLevel = skill;
        this.ping = ping;
        this.maps.addAll(Arrays.asList(maps)); 
    }
    
}
