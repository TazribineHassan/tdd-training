package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzConverterTest {


    @Test
    public void shouldReturnFizzWhenInputIsMultipleOf3() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIsMultipleOf5() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIsMultipleOf15() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(30);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnTheSameInputWhenInputIsNotMultipleOf15Or5Or3() {
        int number = 4;
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(number);
        assertEquals(String.valueOf(number), result);
    }

}