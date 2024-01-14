import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        // initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int input;

        //initialize negative and positive numbers
        int negativeCount = 0, negativeSum = 0;
        int positiveCount = 0, positiveSum = 0;


        //user input loop, until users input 0
        do {

            System.out.print("Input your integer (enter 0 to exit): ");
            input = scanner.nextInt();


            //check if input is positive
            if (input > 0) {
                positiveSum += input;
                positiveCount++;
            }

            //if input negative
            else if (input < 0) {
                negativeSum += input;
                negativeCount++;
            }

        } while (input != 0);


        //calculate the sum of negative numbers and positve numbers
        int total = negativeSum + positiveSum;

        //if user input 0 at the first
        float average = (positiveCount + negativeCount) > 0 ? (float) total / (positiveCount + negativeCount) : 0.0f;


        //display the negative and positive counts
        System.out.println("Total negative integers: " + negativeCount);
        System.out.println("Total positive integers: " + positiveCount);

        //display the total of sum negative and positive numbers, average input values
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        scanner.close();
    }
}

