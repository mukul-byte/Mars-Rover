package org.navi;

import java.util.Objects;

public class Rover {
    private Coordinates coordinates;
    private String direction;
    private String navigationMoves;
    public Rover(Coordinates coordinates, String direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    void changeDirectionTo(String direction){
        this.direction = direction;
    }
    private void moveStraight(Coordinates limitingCoordinates){
        Coordinates expectedCoordinates;
        if (direction == "N") {
            expectedCoordinates = coordinates.incrementYcoordinate();
        } else if (direction == "S") {
            expectedCoordinates = coordinates.decrementYcoordinate();;
        } else if (direction == "W") {
            expectedCoordinates = coordinates.decrementXcoordinate();
        } else {
            expectedCoordinates = coordinates.incrementXcoordinate();
        }

        if(expectedCoordinates.isWithIn(limitingCoordinates)){
            this.coordinates = expectedCoordinates;
        }
    }
    private void moveRight(){
        if (direction == "N") {
            changeDirectionTo("E");
        } else if (direction == "W") {
            changeDirectionTo("N");
        } else if (direction == "S") {
            changeDirectionTo("W");
        } else {
            changeDirectionTo("S");
        }
    }
    public void moveLeft() {
        if (direction == "N") {
            changeDirectionTo("W");
        } else if (direction == "W") {
            changeDirectionTo("S");
        } else if (direction == "S") {
            changeDirectionTo("E");
        } else {
            changeDirectionTo("N");
        }
    }

    public Rover(int roverXCoordinate, int roverYCoordinate, String roverDirection) {
        coordinates = new Coordinates(roverXCoordinate,roverYCoordinate);
        direction = roverDirection;
    }

    public Rover(Coordinates coordinates, String direction, String navigationMoves) {
        this.coordinates = coordinates;
        this.direction = direction;
        this.navigationMoves = navigationMoves;
    }

    public void moves(String roverMoves) {
        moves(roverMoves, new Coordinates(Integer.MAX_VALUE,Integer.MAX_VALUE));
    }
    public void moves(String roverMoves, Coordinates limitingCoordinates) {
        for (int idx = 0; idx < roverMoves.length(); idx++) {
            if (roverMoves.charAt(idx) == '^') {
                moveStraight(limitingCoordinates);
            } else if (roverMoves.charAt(idx) == '<') {
                moveLeft();
            } else {
                moveRight();
            }
        }
    }
    public void moves(int moveIdx, Coordinates limitingCoordinates) {
        String roverMoves = String.valueOf(this.navigationMoves.charAt(moveIdx));
        moves(roverMoves, limitingCoordinates);
    }

    public void moves() {
        moves(this.navigationMoves);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return (direction == rover.direction) && Objects.equals(coordinates, rover.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public String toString() {
        return "Rover{" +
                "direction='" + direction + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
