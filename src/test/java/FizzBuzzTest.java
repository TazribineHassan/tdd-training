import fizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzReturnOneWhenInput1() {
        String result= FizzBuzz.fizzBuzz(1);
        assertEquals("1", result);
    }
}