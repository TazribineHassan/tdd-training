package fizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ListFactoryTest {

    @Test
    public void shouldReturnList1234WhenInputIs4() {
        int input = 4;
        ListFactory factory = new ListFactory();

        List<Integer> result = factory.generateList(input);

        assertArrayEquals(List.of(1,2,3,4).toArray(), result.toArray());
    }
}
