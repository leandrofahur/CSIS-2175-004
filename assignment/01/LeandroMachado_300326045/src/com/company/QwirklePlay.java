package com.company;

import java.util.ArrayList;
import java.util.List;

public class QwirklePlay {
    // Utility:
    // Methods to help testing and developing
    // Generate players and check their cards:
    public static List<Qwirkle> generatePlayer() {
        // create a list of Qwirkle objects:
        List<Qwirkle> player = new ArrayList<Qwirkle>();
        // Create the tiles:
        for(int i = 0; i < 3; i++) {
            player.add(new Qwirkle());
        }
        return player;
    }

    public static void main(String[] args) {
        // Create a list of Qwirkle to represent player 01 and 02:
        List<Qwirkle> player01 = generatePlayer();
        List<Qwirkle> player02 = generatePlayer();

        System.out.println("Player 01:");
        for(Qwirkle q : player01)
        {
            System.out.println(q.toString());
        }

        System.out.println("\nPlayer 01:");
        for(Qwirkle q : player02)
        {
            System.out.println(q.toString());
        }

    }
}

//        Qwirkle q = new Qwirkle(Qwirkle.Color.Red, Qwirkle.Shape.Square);
//        Qwirkle qEqual = new Qwirkle(Qwirkle.Color.Red, Qwirkle.Shape.Square);
//        Qwirkle qR = new Qwirkle();
//        System.out.println(q.getColor());
//        System.out.println(q.getShape());
//        System.out.println(q.toString());
//        System.out.println();
//        System.out.println(qR.getColor());
//        System.out.println(qR.getShape());
//        System.out.println(qR.toString());
//
//        System.out.println(q.isEqual(qR));
//        System.out.println(q.isEqual(qEqual));
