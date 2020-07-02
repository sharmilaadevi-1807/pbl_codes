/*
Initialize a character variable in a program and

print 'Alphabhet' if the initialized value is an alphabhet,

print 'Digit' if the initialized value is a number, and

print 'Special Character', if the initialized value is anything else.
*/

class FlowControl5 {

    static void charCheck(char input_char)
    {
        if ((input_char >= 65 && input_char <= 90)|| (input_char >= 97 && input_char <= 122))
            System.out.println ( " Alphabet ");

        else if (input_char >= 48 && input_char <= 57)
        System.out.println(" Digit ");

        else
        System.out.println ( " Special Character ");
    }

    public static void main (String[] args)
    {
        char input_char = '$';
        charCheck(input_char);

    }
}
