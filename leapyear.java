import java.util.*;
class leapyear
{
  public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int year,date ,month ;
System.out.println("enter the date");
date = sc.nextInt();

System.out.println("enter the month");
month = sc.nextInt();

System.out.println("enter the year");
        year =  sc.nextInt();
        if(((year%4==0) && (year%100!=0)) || (year%400 == 0))
        {
            System.out.println("leap year");
        }else{
         System.out.println(" not a leap year");
        }
    }
}