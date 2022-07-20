import org.junit.jupiter.api.Test;
import org.navi.Rover;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTests {

    @Test
    void setup(){
        assertEquals(1,1);
    }

    @Test
    void expectTrue_1_2_N(){
        //1 2 N
        int roverXCoordinate = 1;
        int roverYCoordinate = 2;
        String roverDirection = "N";
        String roverMoves = "L";
        Rover rover = new Rover(roverXCoordinate, roverYCoordinate, roverDirection);
        assertEquals("1 2 W",rover.moves(roverMoves));
    }


}
