package org.navi;

import java.util.Scanner;

public class MarsRover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxX = sc.nextInt();
        int maxY = sc.nextInt();
        MarsLand marsLand = new MarsLand(maxX, maxY);


        int roverXCoordinate = sc.nextInt();
        int roverYCoordinate = sc.nextInt();
        String roverDirection = sc.nextLine();
        String roverMoves = sc.nextLine();
        Rover rover = new Rover(roverXCoordinate, roverXCoordinate, roverDirection);

//        System.out.println(rover.moves(roverMoves));

    }
}