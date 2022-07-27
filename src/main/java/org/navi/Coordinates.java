package org.navi;

import java.util.Objects;

public class Coordinates {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Coordinates incrementYcoordinate() {
        return new Coordinates(xCoordinate,yCoordinate+1);
    }
    public Coordinates decrementYcoordinate() {
        return new Coordinates(xCoordinate,yCoordinate-1);
    }
    public Coordinates incrementXcoordinate() {
        return new Coordinates(xCoordinate+1,yCoordinate);
    }
    public Coordinates decrementXcoordinate() {
        return new Coordinates(xCoordinate-1,yCoordinate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return xCoordinate == that.xCoordinate && yCoordinate == that.yCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

    public boolean isWithIn(Coordinates limitingCoordinates) {
        boolean areCoordinatesositive = limitingCoordinates.xCoordinate>=0 && limitingCoordinates.yCoordinate>=0;

        return areCoordinatesositive && (this.xCoordinate<= limitingCoordinates.xCoordinate) && (this.yCoordinate <= limitingCoordinates.yCoordinate);
    }
}
