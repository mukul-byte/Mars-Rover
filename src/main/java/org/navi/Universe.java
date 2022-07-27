package org.navi;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    final Coordinates limitingCoordinates;
    final ArrayList<Rover> roversList;
    final int movesCount;

    public Universe(Coordinates limitingCoordinates, ArrayList<Rover> roversList, int movesCount){
        this.limitingCoordinates = limitingCoordinates;
        this.roversList = roversList;
        this.movesCount = movesCount;
    }

    public ArrayList<Rover> moveRovers() {
        for(int moveIdx = 0; moveIdx< movesCount ; moveIdx++){
            for(int roverIdx = 0 ; roverIdx<this.roversList.size() ; roverIdx++){
                this.roversList.get(roverIdx).moves(moveIdx,limitingCoordinates);
            }
        }
        return roversList;
    }

}
