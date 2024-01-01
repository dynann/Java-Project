import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0; //counting times that user input
        int input = 0;  //receive value

        //loop will break after user inputs more than 5 times
        while (count <= 5) {
            System.out.print("input integer : ");
            input = scan.nextInt();
            count++;

        }
        //display the last number that was input
        System.out.println("The last number you entered was a " + "[" + input + "]");

    }
}