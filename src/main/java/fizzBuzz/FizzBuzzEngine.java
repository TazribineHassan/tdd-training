package fizzBuzz;

import java.util.List;

public class FizzBuzzEngine {

    private final FizzBuzzConverter converter = new FizzBuzzConverter();
    private final ListFactory factory = new ListFactory();


    public void displayFizzBuzz(int i) {
        List<Integer> integerList = factory.generateList(i);
        integerList.forEach(item -> System.out.print(item + " => " + converter.convert(item) + "\n"));
    }
}
