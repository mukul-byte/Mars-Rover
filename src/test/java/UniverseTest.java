import org.junit.jupiter.api.Test;
import org.navi.Coordinates;
import org.navi.Rover;
import org.navi.Universe;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniverseTest {

    @Test
    public void expectTrueWithInitPos_0_0_N_Move_M_FinalPos_0_1_N_LimitCoor_2_2() {
        Rover rover = new Rover(new Coordinates(0, 0), "N","M");
        Universe universe = new Universe( new Coordinates(2,2) , new ArrayList(List.of(rover)) , 1);
        universe.moveRovers();
        assertEquals(rover,(new Rover(0, 1, "N")));
    }

    @Test
    public void expectTrueWithInitPos_0_0_N_Move_MMM_FinalPos_0_2_N_LimitCoor_2_2() {
        Rover rover = new Rover(new Coordinates(0, 0), "N","MMM");
        Universe universe = new Universe(new Coordinates(2,2), new ArrayList(List.of(rover)),3);
        assertEquals(universe.moveRovers(),new ArrayList(List.of(new Rover(0, 2, "N"))));
    }

}
