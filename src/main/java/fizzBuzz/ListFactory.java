package fizzBuzz;

import java.util.List;

public class ListFactory {
    public List<Integer> generateList(int input) {
        if (input == 0) throw new RuntimeException("Number must be greater then 0");
        return List.of(1, 2, 3, 4);
    }
}
