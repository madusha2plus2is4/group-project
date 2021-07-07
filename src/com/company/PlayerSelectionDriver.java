package com.company;

import java.util.*;

public class PlayerSelectionDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<PlayerSelection> listOfPlayers = new ArrayList<>();

        String userOption;
        PlayerSelection player = null;

        do {
            menu();
            System.out.println("enter your selection :" );
            userOption = input.nextLine();

            switch (userOption) {
                case "A" -> {
                    System.out.print("Enter player's Name : ");
                    String name = input.nextLine();
                    System.out.print("Enter player's Age : ");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.println("""
                            If player's type  ....
                            spring bowler  --> enter spring\040
                            seam bowler    --> enter seam
                            batsman        --> enter bat
                            keeper         --> enter keeper""");
                    System.out.print("Enter player's Type : ");
                    String type = input.nextLine();
                    System.out.print("Enter player's Statistics : ");
                    int statistics = input.nextInt();
                    input.nextLine();
                    player = new PlayerSelection(name, age, type, statistics);
                    listOfPlayers.add(player);
                }
                case "V" -> player.viewAllPlayers(listOfPlayers);
                case "B" -> {
                    sortingOutArrayListByStatistics(listOfPlayers);
                    displayBestTwoBatsmen(listOfPlayers);
                }
                case "C" -> {
                    sortingOutArrayListByStatistics(listOfPlayers);
                    displayBestTwoBallers(listOfPlayers);
                }
                case "D" -> {
                    sortingOutArrayListByStatistics(listOfPlayers);
                    displayBestKeeper(listOfPlayers);
                }
            }
        }while (!userOption.equals("X"));
    }

    public static void menu() {
        System.out.println();
        System.out.println("add a player              press A");
        System.out.println("view all players          press V");
        System.out.println("Display Best Two Batsmen  press B");
        System.out.println("Display Best Two Ballers  press C");
        System.out.println("Display Best Keeper       press D");
        System.out.println("To Exit                   press X");
        System.out.println();
    }

    /**
     * takes the sorted array list and goes though every object and checks whether the objects type equals
     * to the "bat" if it matches that name of the player's object adds into a new list called "bestBatsmanList"
     * finally prints out the first two names of that array
     * @param arrayList1
     */
    public static void displayBestTwoBatsmen(ArrayList<PlayerSelection> arrayList1) {
        ArrayList<String> bestBatsmanList = new ArrayList<>();

        for (PlayerSelection playerSelection : arrayList1) {
            if (playerSelection.getPlayerType().equals("bat")) {
                bestBatsmanList.add(playerSelection.getPlayerName());
            }
        }

        System.out.println("Best Two Batsman's are :");
        System.out.println(bestBatsmanList.get(0));
        System.out.println(bestBatsmanList.get(1));
    }

    /**
     * this basically sort out the listOfPlayers array list by PlayerStatistics in descending order
     * @param arrayList1 listOfPlayers array List
     */
    public static void sortingOutArrayListByStatistics(ArrayList<PlayerSelection> arrayList1) {
        arrayList1.sort((o1, o2) -> Integer.compare(o2.getPlayerStatistics(), o1.getPlayerStatistics()));
    }

    //refer to the displayBestTwoBatsmen comment
    public static void displayBestTwoBallers(ArrayList<PlayerSelection> arrayList1) {
        ArrayList<String> bestBallersList = new ArrayList<>();

        for (PlayerSelection playerSelection : arrayList1) {
            if (playerSelection.getPlayerType().equals("seam") || playerSelection.getPlayerType().equals("spring")) {
                bestBallersList.add(playerSelection.getPlayerName());
            }
        }
        System.out.println("Best Two Baller's are :");
        System.out.println(bestBallersList.get(0));
        System.out.println(bestBallersList.get(1));
    }

    //refer to the displayBestTwoBatsmen comment
    public static void displayBestKeeper(ArrayList<PlayerSelection> arrayList1) {
        ArrayList<String> bestKeeperList = new ArrayList<>();

        for (PlayerSelection playerSelection : arrayList1) {
            if (playerSelection.getPlayerType().equals("keeper")) {
                bestKeeperList.add(playerSelection.getPlayerName());
            }
        }

        System.out.println("Best Keeper is :");
        System.out.println(bestKeeperList.get(0));
    }


}
