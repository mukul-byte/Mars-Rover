import org.junit.jupiter.api.Test;
import org.navi.MarsLand;
import org.navi.Rover;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MarsRoverTests {

    @Test
    void setup(){
        assertEquals(1,1);
    }

    @Test
    void expectTrue_1_2_N(){
        Rover rover = new Rover(1, 2, "N");
        assertEquals("1 2 W",rover.moves("L"));
    }

    @Test
    void expectTrue_1_3_N(){
        Rover rover = new Rover(1, 2, "N");
        assertEquals("1 3 N",rover.moves("LMLMLMLMM"));
    }

    @Test
    void expectTrue_5_1_E(){
        Rover rover = new Rover(3, 3, "E");
        assertEquals("5 1 E",rover.moves("MMRMMRMRRM"));
    }

    @Test
    void expectTrue_MarsLand_setup(){
        assertNotEquals(null, new MarsLand(5,5));
    }

}
