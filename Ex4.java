import java.util.*;
public class Ex4 {
    public static void main(String[] args){

        int computer_num = 50;
        int guess;
        int guessCout = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("guess the number : ");
        guess = scanner.nextInt();

        while(guess != computer_num)
        {
            if(guess < computer_num)
            {
                System.out.println("too low guess agian : ");
                guess = scanner.nextInt();
            }
            else {
                System.out.println("too hgih guess agian : ");
                guess = scanner.nextInt();
            }

            guessCout++;
        }

        System.out.println("Well done, You took " + "[" + guessCout + "]" + "times");

    }
}