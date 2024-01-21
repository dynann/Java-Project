public class Ex1 {
    public static void main(String[] args) {

        //initialize string object
        String string = new String("abc defg IHJK");

        //object refers to converted string
        String convert = new String();

        //convert string to char array
        char[] chars = string.toCharArray();

        //iterate through string as char array
        for (int i = 0; i < chars.length; i++) {

            //check if blank space skip
            if (chars[i] != ' ') {

                //convert an alphabet to its next alphabet
                char c = (char) (chars[i] + 1);

                //add each character to new string
                convert += Character.toString(c);


            } else convert += ' '; //add space to its place

        }

        System.out.println(convert);
    }
}

//chat gpt
//public class NextAlphabetConverter {
//    public static void main(String[] args) {
//        // Your input string
//        String inputString = "Hello, World!";
//
//        // Convert each alphabet to its next alphabet
//        String resultString = convertToNextAlphabet(inputString);
//
//        // Print the result
//        System.out.println("Original String: " + inputString);
//        System.out.println("Result String: " + resultString);
//    }
//
//    private static String convertToNextAlphabet(String input) {
//        char[] charArray = input.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            // Check if the character is an alphabet (a-z or A-Z)
//            if (Character.isLetter(charArray[i])) {
//                // Determine the case (uppercase or lowercase)
//                boolean isUpperCase = Character.isUpperCase(charArray[i]);
//
//                // Convert the character to its next alphabet
//                char nextAlphabet = (char) (charArray[i] + 1);
//
//                // Handle 'Z' or 'z' to loop back to 'A' or 'a'
//                if ((isUpperCase && nextAlphabet > 'Z') || (!isUpperCase && nextAlphabet > 'z')) {
//                    nextAlphabet -= 26;
//                }
//
//                // Update the character in the array
//                charArray[i] = nextAlphabet;
//            }
//        }
//        return new String(charArray);
//    }
//}
