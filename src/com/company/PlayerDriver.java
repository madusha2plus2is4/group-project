package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Player> listOfPlayers = new ArrayList<>();

        int userOption;
        Player player = null;

        do {
            menu();
            System.out.println("enter your selection :" );
            userOption = input.nextInt();

            switch (userOption) {
                case 1 -> {
                    input.nextLine();
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
                    player = new Player(name, age, type, statistics);
                    listOfPlayers.add(player);
                }
                case 2 -> player.playerDetails(listOfPlayers);
                case 3 -> bestPerformance(listOfPlayers);
                case 4 -> {
                    input.nextLine();
                    System.out.println("enter the player's name you wanna find the type of :");
                    String findType = input.nextLine();
                    gettingPlayersType(listOfPlayers, findType);
                }
                case 5 -> player.batsmanDetails(listOfPlayers);
            }
        }while (userOption!=6);

    }

    public static void menu() {
        System.out.println();
        System.out.println("add a player              press 1");
        System.out.println("view all players          press 2");
        System.out.println("Display Best Performance  press 3");
        System.out.println("Display get player type   press 4");
        System.out.println("Display batting average   press 5");
        System.out.println("To Exit                   press 6");
        System.out.println();
    }

    /**
     * sorting the listOfPlayers array list by the players Statistics in descending order
     * @param arrayList1 this is the listOfPlayers array
     * prints out the sorted arrays first object's name
     */
    public static void bestPerformance(ArrayList<Player> arrayList1) {
        //sorting the listOfPlayers array list by the players Statistics in descending order
        arrayList1.sort((o1, o2) -> Integer.compare(o2.getPlayerStatistics(), o1.getPlayerStatistics()));

        System.out.println("Best performer is :");
        System.out.println(arrayList1.get(0).getPlayerName());
    }

    /**
     * going through each object in the listOfPlayers array and if the given name matches the objects players name
     * it prints out the type of that player
     * @param arrayList1 this is the listOfPlayers array
     * @param name users given name of the player
     */
    public static void gettingPlayersType(ArrayList<Player> arrayList1, String name) {
        for (Player player : arrayList1) {
            if (player.getPlayerName().equals(name)) {
                System.out.println("type of the player yr looking for :" + (player.getPlayerType()));
            }
        }
    }
}
