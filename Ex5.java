public class Ex5 {
    public static void main(String[] args) {
        int n = 2;
        int[] arrays = new int[100];
        boolean process = true;


        while (process) {
            if (Math.pow(n, 3) < 10000) n += 2;
            else if (Math.pow(n, 3) < Math.pow(n + 2, 3) && Math.pow(n + 2, 3) > 10000 ) {
                arrays[n] = n;
                if(Math.pow(arrays[n], 3) < 10000){

                }


                System.out.println(arrays[n]);
                break;
            }
        }


//        while( Math.pow(n, 3) < 10000)
//        {
//            n += 2;
//        }
//        System.out.println("the largest integer is : " + (n-2));
    }
}