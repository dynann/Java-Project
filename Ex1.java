import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        int total = 0;
        Scanner scan = new Scanner(System.in);

      //using while loop until total is bigger than 50
        while (total <= 50) {
            System.out.print("input integer  : ");
            int input = scan.nextInt();

            //assign the value of input to total by adding the previous total
            total = input + total;
        }
        //display total
        System.out.println("The total is " + "[" + total + "]");
    }

}