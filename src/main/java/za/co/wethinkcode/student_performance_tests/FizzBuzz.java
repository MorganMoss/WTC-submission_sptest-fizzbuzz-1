package za.co.wethinkcode.student_performance_tests;

public class FizzBuzz {
    // TODO implement this class
    public FizzBuzz() {
    }
    public static String process(int i) {
        boolean divisible_by_5 = i%5==0;
        boolean divisible_by_3 = i%3==0;
        String result = "";
        if (divisible_by_3){
            result += "Fizz";
        }
        if (divisible_by_5){
            result += "Buzz";
        }
        if (!divisible_by_3 && !divisible_by_5){
            return Integer.toString(i);
        }
        return result;
    }

    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            String msg = String.valueOf(i) + " is " + process(i); // HINT: implement this process() function
            System.out.println(msg);
        }
    }
}
