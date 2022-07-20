package org.navi;

public class Rover {
    private int xCoordinate;
    private int yCoordinate;
    private String direction;


    public Rover(int roverXCoordinate, int roverYCoordinate, String roverDirection) {
        xCoordinate = roverXCoordinate;
        yCoordinate = roverYCoordinate;
        direction = roverDirection;
    }

    public String moves(String roverMoves) {
        for (int idx = 0; idx < roverMoves.length(); idx++) {
            if (roverMoves.charAt(idx) == 'M') {
                if (direction == "N") {
                    yCoordinate++;
                } else if (direction == "S") {
                    yCoordinate--;
                } else if (direction == "W") {
                    xCoordinate--;
                } else {
                    xCoordinate++;
                }
            } else if (roverMoves.charAt(idx) == 'L') {
                if (direction == "N") {
                    direction = "W";
                } else if (direction == "W") {
                    direction = "S";
                } else if (direction == "S") {
                    direction = "E";
                } else {
                    direction = "N";
                }
            } else {
                if (direction == "N") {
                    direction = "E";
                } else if (direction == "W") {
                    direction = "N";
                } else if (direction == "S") {
                    direction = "W";
                } else {
                    direction = "S";
                }
            }
        }

        return xCoordinate + " " + yCoordinate + " " + direction;

//        return new Rover(xCoordinate,yCoordinate,direction);
    }

}
