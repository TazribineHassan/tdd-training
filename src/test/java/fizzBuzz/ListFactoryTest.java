package fizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListFactoryTest {

    @Test
    public void shouldReturnList1234WhenInputIs4() {
        int input = 4;
        ListFactory factory = new ListFactory();

        List<Integer> result = factory.generateList(input);

        assertArrayEquals(List.of(1, 2, 3, 4).toArray(), result.toArray());
    }

    @Test
    public void shouldThrowRunTimeExceptionWhenInputIs0() {
        int input = 4;
        ListFactory factory = new ListFactory();
        RuntimeException exception = assertThrows(RuntimeException.class, () -> factory.generateList(0));
        assertEquals("Number must be greater then 0", exception.getMessage());
    }

    @Test

    public void shouldReturnListFrom1ToInputWhenInputIsGiven() {

        int input = 7;
        ListFactory factory = new ListFactory();
        List<Integer> result = factory.generateList(input);
        assertArrayEquals(List.of(1, 2, 3, 4, 5, 6, 7).toArray(), result.toArray());
    }
}
