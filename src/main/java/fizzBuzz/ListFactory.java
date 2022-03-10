package fizzBuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListFactory {
    public List<Integer> generateList(int input) {

        if (input == 0) throw new RuntimeException("Number must be greater then 0");
        return IntStream.rangeClosed(1, input).boxed().collect(Collectors.toList());
    }
}
