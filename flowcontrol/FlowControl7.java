/*
 Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.
*/

public class FlowControl7 {

    public static void main(String[] args) {
        char ch = 'a';

        if (Character.isLowerCase(ch))
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        else
            System.out.println(ch + "->" + Character.toLowerCase(ch));

    }

}