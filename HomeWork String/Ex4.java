import java.util.Scanner;

public class Ex4 {
    public static void main(String[] Args){

        Scanner getText = new Scanner(System.in);
        String string = getText.nextLine();

        String getString = "";

        for(int i = string.length() - 1 ; i >= 0; i--){
            getString = getString + string.charAt(i);
        }

        if(string.equals(getString)){
            System.out.println(true);
        }

    }
}
