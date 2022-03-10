package fizzBuzz;

public class FizzBuzzConverter {


    public String convert(int i) {
        if (i == 0) throw new RuntimeException("Number must be greater then zero");
        if (i % 15 == 0) return "FizzBuzz";
        if (i % 5 == 0) return "Buzz";
        if (i % 3 == 0) return "Fizz";
        return String.valueOf(i);
    }
}
