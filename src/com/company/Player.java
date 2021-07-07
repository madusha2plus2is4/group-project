package com.company;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private int playerAge;
    private String playerType;
    private int playerStatistics;

    public String getPlayerType() {
        return playerType;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerStatistics() {
        return playerStatistics;
    }

    public Player(String playerName, int playerAge, String playerType, int playerStatistics) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerType = playerType;
        this.playerStatistics = playerStatistics;
    }

    public void printValues() {
        System.out.println("player's name       " + playerName);
        System.out.println("player's age        " + playerAge);
        System.out.println("player's type       " + playerType);
        System.out.println("player's Statistics " + playerStatistics);
        System.out.println();
    }

    public void playerDetails(ArrayList<Player> displayArray) {
        for (Player player : displayArray) {
            player.printValues();
        }
        System.out.println();
    }

    public void printBattingAverage() {
        System.out.println("batsman's name        " + playerName);
        System.out.println("batsman's age         " + playerAge);
        System.out.println("batsman's type        " + playerType);
        System.out.println("batsman's batting avg " + playerStatistics/15);
        System.out.println();
    }

    public void batsmanDetails(ArrayList<Player> displayArray) {
        for (Player player : displayArray) {
            player.printBattingAverage();
        }
        System.out.println();
    }


}
