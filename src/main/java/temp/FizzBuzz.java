package temp;

public class FizzBuzz {

    public String play(int num){
        if(num == 0) throw new IllegalArgumentException("Numbers must be greater than zero");
        if(isMutipleOfThree(num) && isMultipleOfFive(num)) return "FizzBuzz";
        if(isMutipleOfThree(num)) return "Fizz";
        if(isMultipleOfFive(num)) return "Buzz";
        return String.valueOf(num);
    }

    private boolean isMultipleOfFive(int num) {
        return num % 5 == 0;
    }

    private boolean isMutipleOfThree(int num) {
        return num % 3 == 0;
    }
}
