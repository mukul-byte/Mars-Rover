import org.junit.jupiter.api.Test;
import org.navi.MarsLand;
import org.navi.Rover;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTests {

    @Test
    void setup() {
        assertEquals(1, 1);
    }

    @Test
    void expectTrue_1_2_N_L_To_1_2_W() {
        Rover rover = new Rover(1, 2, "N");
        rover.moves("L");
        assertEquals(rover,(new Rover(1, 2, "W")));
    }

    @Test
    void expectTrue_1_2_N_LMLMLMLMM_To_1_3_N() {
        Rover rover = new Rover(1, 2, "N");
        rover.moves("LMLMLMLMM");
        assertEquals(rover,(new Rover(1, 3, "N")));
    }

    @Test
    void expectTrue_3_3_E_MMRMMRMRRM_To_5_1_E() {
        Rover rover = new Rover(3, 3, "E");
        rover.moves("MMRMMRMRRM");
        assertEquals(rover,(new Rover(5, 1, "E")));
    }

    @Test
    void expectTrue_MarsLand_setup() {
        assertNotEquals(null, new MarsLand(5, 5));
    }

}
