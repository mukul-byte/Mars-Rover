package org.navi;

import java.util.Objects;

public class Rover {
    private Coordinates coordinates;
    private String direction;

    public Rover(Coordinates coordinates, String direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    void changeDirectionTo(String direction){
        this.direction = direction;
    }
    private void moveStraight(){
        if (direction == "N") {
            coordinates.incrementYcoordinate();
        } else if (direction == "S") {
            coordinates.decrementYcoordinate();;
        } else if (direction == "W") {
            coordinates.decrementXcoordinate();
        } else {
            coordinates.incrementXcoordinate();
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

        return new Rover(this.coordinates, direction);
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
