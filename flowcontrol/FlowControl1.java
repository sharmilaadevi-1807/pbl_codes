/*
 Write a program to check if a given integer number is Positive, Negative, or Zero.
 */
public class FlowControl1
{
    public static void main(String[] args)
    {
        int number = Integer.parseInt(args[0]);
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}