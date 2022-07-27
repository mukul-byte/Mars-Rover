package org.navi;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    final Coordinates limitingCoordinates;
    final ArrayList<Rover> roversList;

//    public Universe(Coordinates limitingCoordinates){
//        this.limitingCoordinates = limitingCoordinates;
//    }

//    public Universe(Coordinates limitingCoordinates, Rover rover){
//        this(limitingCoordinates,new ArrayList(List.of(rover)));
//    }

    public Universe(Coordinates limitingCoordinates, ArrayList<Rover> roversList){
        this.limitingCoordinates = limitingCoordinates;
        this.roversList = roversList;
    }


}
