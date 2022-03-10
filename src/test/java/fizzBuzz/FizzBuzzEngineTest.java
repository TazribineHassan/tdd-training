package fizzBuzz;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzEngineTest {


    @Test
    public void shouldDisplay1To1WhenInputIs1() throws Exception {
        int input = 1;
        FizzBuzzEngine engine = new FizzBuzzEngine();

        String result = tapSystemOut(() -> {
            engine.displayFizzBuzz(input);
        });
        assertEquals("1 => 1\n", result);
    }

    @Test
    public void shouldDisplay1To1And2To2And3ToFizzWhenInputIs3() throws Exception {
        int input = 3;
        FizzBuzzEngine engine = new FizzBuzzEngine();

        String result = tapSystemOut(() -> {
            engine.displayFizzBuzz(input);
        });
        assertEquals("1 => 1\n2 => 2\n3 => Fizz\n", result);
    }

    @Test
    public void shouldDisplayFizzToMulOf3AndBuzzToMulOf5AndFizzBuzzToMulOf15WhenInputIsGreaterThen0() throws Exception {
        int input = 15;
        FizzBuzzEngine engine = new FizzBuzzEngine();

        String result = tapSystemOut(() -> {
            engine.displayFizzBuzz(input);
        });
        String expected = "1 => 1\n2 => 2\n3 => Fizz\n4 => 4\n5 => Buzz\n" +
                          "6 => Fizz\n7 => 7\n8 => 8\n9 => Fizz\n10 => Buzz\n" +
                          "11 => 11\n12 => Fizz\n13 => 13\n14 => 14\n15 => FizzBuzz";

        assertEquals(expected, result.trim());
    }

}
