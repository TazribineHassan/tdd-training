package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConverterTest {


    @Test
    public void shouldReturnFizzWhenInputIsMultipleOf3(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(3);
        assertEquals("Fizz",result);
    }

}