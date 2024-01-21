import java.util.Scanner;

public class Ex3 {
    public static void main(String[] Args){
        Scanner getString = new Scanner(System.in);
        String stirngRecieve = getString.nextLine();
        StringBuilder builder = new StringBuilder();
        char[] chars = stirngRecieve.toCharArray();

        for(int i = 0 ; i < chars.length ; i++){
            char c = chars[i];
            if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
                builder.append(c);
            }

        }
        System.out.println(builder);
    }
}
