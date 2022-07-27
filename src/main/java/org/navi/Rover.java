package org.navi;

public class Rover {
    private int xCoordinate;
    private int yCoordinate;
    private String direction;

    private void moveStraight(){
        if (direction == "N") {
            yCoordinate++;
        } else if (direction == "S") {
            yCoordinate--;
        } else if (direction == "W") {
            xCoordinate--;
        } else {
            xCoordinate++;
        }
    }
    private void moveRight(){
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

    public void moveLeft() {
        if (direction == "N") {
            direction = "W";
        } else if (direction == "W") {
            direction = "S";
        } else if (direction == "S") {
            direction = "E";
        } else {
            direction = "N";
        }
    }

    public Rover(int roverXCoordinate, int roverYCoordinate, String roverDirection) {
        xCoordinate = roverXCoordinate;
        yCoordinate = roverYCoordinate;
        direction = roverDirection;
    }

    public Rover moves(String roverMoves) {
        for (int idx = 0; idx < roverMoves.length(); idx++) {
            if (roverMoves.charAt(idx) == 'M') {
                moveStraight();
            } else if (roverMoves.charAt(idx) == 'L') {
                moveLeft();
            } else {
                moveRight();
            }
        }

        return new Rover(xCoordinate, yCoordinate, direction);
    }

    public boolean equalsTo(Rover anotherRover) {
        return ((xCoordinate == anotherRover.xCoordinate) && (yCoordinate == anotherRover.yCoordinate) && (direction == anotherRover.direction));
    }

}
