public class Exercise8 {
    public static void main(String[] args){
        double total = 0;
        for(int i = 1 ; i <= 97; i += 2){
            total += (double) i/(i+2);
        }
        System.out.println("Total is " + "[" + total + "]" );

    }
}
