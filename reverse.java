
import java.util.*;
class reverse 
{
    public static void main(String[] args) 
    {
        Scanner sec = new Scanner(System.in);
        int rev =0,digit,num;
        num=sec.nextInt();
        while(num>0)
        {
            digit=num%10;
            rev = rev * 10 + digit;
            num=num/10;
        }
        System.out.println("reverse num is " +rev);
    }
}