public class TernaryEx {
    public static void main(String[] args) {

            //Ternary operator - condition ? expressionIfTrue : expressionIfFalse;
            findMaxNumber();
            eligibleToVode();

        }

        private static void findMaxNumber() {
        /*
        //Exercise 1 - Find the Maximum of Two Numbers
        Write a program that takes two numbers and uses the ternary operator to find and display the maximum of the two numbers.
        Example
        Input: num1 = 10, num2 = 20
        Expected Output: "The maximum number is 20"
         */

            int num1 = 10;
            int num2 = 20;

            // Use ternary operator to find the maximum of num1 and num2
            int max = (num1 > num2) ? num1 : num2;

            System.out.println("The maximum number is " + max);
        }

        private static void eligibleToVode() {
        /*
        //Exercise 2 - Check if a Person is Eligible to Vote
        Write a program that takes a person's age and uses the ternary operator to determine if the person is eligible to vote (age 18 or older). If eligible, the program should print "Eligible to vote"; otherwise, it should print "Not eligible to vote."
        Example
        Input: age = 17
        Expected Output: "Not eligible to vote"
        Input: age = 20
        Expected Output: "Eligible to vote"
         */

            int age = 17;

            // Use ternary operator to check if age is 18 or older
            String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

            System.out.println(result);
        }
        }

