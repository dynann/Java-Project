public class Exercise10 {
    public static void main(String[] args) {
        int temp_sum = 0;
        for (int i = 6; i < 10000; i++) {
            temp_sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                     temp_sum += j;
                }
            }
            if( temp_sum == i){
                System.out.println("perfect number is : " + i);
            }

        }
    }
}
