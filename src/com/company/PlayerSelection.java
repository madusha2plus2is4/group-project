package com.company;

import java.util.ArrayList;

public class PlayerSelection {
    private String playerName;
    private int playerAge;
    private String playerType;
    private int playerStatistics;

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerType() {
        return playerType;
    }

    public int getPlayerStatistics() {
        return playerStatistics;
    }

    public PlayerSelection(String playerName, int playerAge, String playerType, int playerStatistics) {
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

    /**
     * displaying the entered values of players
     * @param displayArray listOfPlayers arrayList
     */
    public void viewAllPlayers(ArrayList<PlayerSelection> displayArray) {
        for (PlayerSelection student : displayArray) {
            student.printValues();
        }
        System.out.println();
    }




}
