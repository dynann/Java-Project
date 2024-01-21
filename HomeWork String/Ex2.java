import java.util.Scanner;

public class Ex2 {
    public static void main(String[] Args){
        Scanner string_Input = new Scanner(System.in);
        String string_Recieve = string_Input.nextLine();
        StringBuilder string_Clean = new StringBuilder();

        char[] chars = string_Recieve.toCharArray();
        for(int i  = 0 ; i < chars.length; i++){
            char c = chars[i];
            if((i > 0) && (Character.isUpperCase(chars[i])) && (chars[i-1] != ' ')){
               string_Clean.append(' ');
            }
            string_Clean.append(c);
        }
        System.out.println("before adjusting : ");
        System.out.println(string_Recieve);

        System.out.println("after adjusting : ");
        System.out.println(string_Clean);
    }
}
