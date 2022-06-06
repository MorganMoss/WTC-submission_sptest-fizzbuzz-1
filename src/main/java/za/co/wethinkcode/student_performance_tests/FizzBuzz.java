package za.co.wethinkcode.student_performance_tests;

public class FizzBuzz {
    // TODO implement this class

    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            String msg = String.valueOf(i) + " is " + process(i); // HINT: implement this process() function
            System.out.println(msg);
        }
    }
}
