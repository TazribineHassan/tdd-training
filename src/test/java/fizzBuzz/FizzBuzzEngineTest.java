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
        assertEquals("1 => 1", result);
    }

    @Test
    public void shouldDisplay1To1And2To2And3ToFizzWhenInputIs3() throws Exception {
        int input = 3;
        FizzBuzzEngine engine = new FizzBuzzEngine();

        String result = tapSystemOut(() -> {
            engine.displayFizzBuzz(input);
        });
        assertEquals("1 => 1\n 2 => 2\n 3 => Fizz\n", result);
    }

}
