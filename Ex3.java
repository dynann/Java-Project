
import java.util.*;

public class Ex3 {
    public static void main(String[] args) {

        int sum = 0;  //store the total value
        int input = 0;  //receive an integer
        char input2;  //receive user character answer
        boolean put; //loop condition


        Scanner scan = new Scanner(System.in);
        System.out.print("input number  : ");
        input = scan.nextInt();
        sum = input + sum; //adding input value to sum


        System.out.print("input another number : ");
        input = scan.nextInt();
        sum = input + sum; //adding another input value to sum


        System.out.println("do you want to add another number, y for yes :  ");
        input2 = scan.next().charAt(0);

        //ask user for answer wether if user continues or not

        //if user input y condition meet
        if (input2 == 'y') {
            put = true;
            while (put) {

                System.out.print("input another integer : ");
                input = scan.nextInt();
                sum = input + sum; //adding another input value to sum


                System.out.println("do you want to add another number, y for yes:  ");
                input2 = scan.next().charAt(0);

                //check the condition if answer is not y while loop breaks
                if (input2 != 'y') {

                    put = false;


                    //display final sum
                    System.out.println("Total is " + "[" + sum + "]");
                }
            }
        } else System.out.println("Total is " + "[" + sum + "]"); //display final sum if answer is not y

    }
}