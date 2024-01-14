public class Exercise7 {
    public static void main(String[] args) {

        //initialize the line for counting numbers in 1 line
        int line = 0;

        //loop through given integers
        for (int i = 100; i <= 200; i++) {

            //check if  is divisible by 5 or 6 but not both
            if ((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)) {

                line++;
                //display integers
                System.out.print(i + " ");

                //check if line already has 10 numbers
                if (line % 10 == 0) {

                    //display new line
                    System.out.println();
                }

            }

        }
    }
}
