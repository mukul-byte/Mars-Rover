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
        Universe universe = new Universe(new Coordinates(2,2), new ArrayList(List.of(rover)));

        assertEquals(rover.moves(),(new Rover(0, 1, "N")));
    }
}
