package com.company;

import java.util.*;

public class QwirklePlay {
    // Utility:
    // Methods to help testing and developing
    // Generate players and check their cards:
    public static List<Qwirkle> generatePlayer() {
        // create a list of Qwirkle objects:
        List<Qwirkle> player = new ArrayList<Qwirkle>();
        // Create the tiles:
        for(int i = 0; i < 3; i++) {
            // test with fixed tile generator to check the compare section below:
            // player.add(new Qwirkle(Qwirkle.Color.Red, Qwirkle.Shape.Square));
            player.add(new Qwirkle());
        }

        // Compare the tile by pairs and then generate a new tile if there is copy's.
        if(player.get(0).isEqual(player.get(1))) {
            player.set(1, new Qwirkle());

            if (player.get(0).isEqual(player.get(2))) {
                player.set(2, new Qwirkle());
            }

            if (player.get(1).isEqual(player.get(2))) {
                player.set(2, new Qwirkle());
            }
        }
        return player;
    }

    // Method to check cards between the two players:
    public static void comparePlayersTiles(List<Qwirkle> player01, List<Qwirkle> player02) {
        for(int i = 0; i < player01.size(); i++) {
            for(int j = 0; j < player02.size(); j++) {
                if (player01.get(i).isEqual(player02.get(j))) {
                    player02.set(j, new Qwirkle());
                }
            }
        }
    }

    public static int evaluateScore(List<Qwirkle> player) {
        int scoreColor = 0;
        int scoreShape = 0;

        List<Integer> colorList = new ArrayList<Integer>();
        List<Integer> shapeList = new ArrayList<Integer>();
        HashSet<Integer> colorHashSet = new HashSet<>();
        HashSet<Integer> shapeHashSet = new HashSet<>();

        // make a list of the values for color and shape:
        for (int i = 0; i< player.size(); i++) {
            colorList.add(player.get(i).getColor());
            shapeList.add(player.get(i).getShape());
        }

        // add all elements form the integer list in a hashtable:
        colorHashSet.addAll(colorList);
        shapeHashSet.addAll(shapeList);

        if(colorHashSet.size() == 3) {
            scoreColor = 0;
        }
        if(colorHashSet.size() == 2) {
            scoreColor = 1;
        }
        if(colorHashSet.size() == 1) {
            scoreColor = 2;
        }

        // System.out.print("\nColor: " + colorHashSet + " " + scoreColor);

        if(shapeHashSet.size() == 3) {
            scoreShape = 0;
        }
        if(shapeHashSet.size() == 2) {
            scoreShape = 1;
        }
        if(shapeHashSet.size() == 1) {
            scoreShape = 2;
        }

        // System.out.print("\n\nShape: " + shapeHashSet + " " + scoreShape);

        return scoreColor + scoreShape;
    }

    public static void main(String[] args) {
        int scorePlayer01 = 0;
        int scorePlayer02 = 0;

        // Create a list of Qwirkle to represent player 01 and 02:
        List<Qwirkle> player01 = generatePlayer();
        List<Qwirkle> player02 = generatePlayer();

        // Compare to make sure both players have unique cards:
        comparePlayersTiles(player01,player02);


        // System.out.println("\nPlayer 01:");
        // for(Qwirkle q : player01) {
        //     System.out.println(q.toString());
        // }

        // System.out.println("\nPlayer 02:");
        // for(Qwirkle q : player02) {
        //     System.out.println(q.toString());
        // }

        System.out.println("Player 1");
        System.out.println("================================");
        System.out.println(String.format("%-8s\t%-8s", "Shape", "Colour"));
        System.out.println("================================\n");
        for (int i = 0; i < player01.size(); i++) {
            System.out.println(String.format("%-8s\t%-8s",Qwirkle.Shape.forValue(player01.get(i).getShape()),Qwirkle.Color.forValue(player01.get(i).getColor())));
        }
        System.out.println("\nPlayer 2");
        System.out.println("================================");
        System.out.println(String.format("%-8s\t%-8s", "Shape", "Colour"));
        System.out.println("================================\n");
        for (int i = 0; i < player01.size(); i++) {
            System.out.println(String.format("%-8s\t%-8s",Qwirkle.Shape.forValue(player02.get(i).getShape()),Qwirkle.Color.forValue(player02.get(i).getColor())));
        }

        scorePlayer01 = evaluateScore(player01);
        scorePlayer02 = evaluateScore(player02);

        if(scorePlayer01 > scorePlayer02) {
            System.out.println("\nPlayer 1 won with score " + scorePlayer01);
        }

        if (scorePlayer02 > scorePlayer02) {
            System.out.println("\nPlayer 2 won with score " + scorePlayer02);
        }

        if(scorePlayer01 == scorePlayer02) {
            System.out.println("\nTie with score " + scorePlayer01);
        }
    }
}
