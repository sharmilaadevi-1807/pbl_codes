//prime number between 10 and 99

public class FlowControl13 {
    public static void main(String[] args) {
    int c;
    for (int i = 10;i < 99; i++) {
        c = 0;
        for(int j=2;j<i/2;j++) {
            if(i%j == 0)
            {
            c++;
            break;
            }
        }
        if(c ==0 && i!=1)
        {
        System.out.print(i + " ");
        }
    }
                }
}