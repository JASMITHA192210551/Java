import java.util.Scanner;

public class star6
{
    public static void main(String[] args) 
    {
        Scanner abc3 = new Scanner(System.in);
        int n = abc3.nextInt();

        for(int i = 0;i < n;i++)
        {
            for(int j = (n - i);j > 0;j--)
            {
                System.out.print(" ");
            }
            int c = 1;
            for(int j = 0;j <= i; j++)
            {
                System.out.print(" " + c + " ");
                c = c * (i - j)/(j + 1);
            }
            System.out.println();
        }
    }
}