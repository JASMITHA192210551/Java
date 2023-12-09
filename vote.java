import java.util.*;
class vote
{
public static void main(String args[])
{
Scanner sec = new Scanner (System.in);
int age;
age=sec.nextInt();
if(age>=18)
{
System.out.println("eligible to vote ");
}else{
 int yearsLeft = 18 - age;
System.out.println("not eligible to vote " +yearsLeft);
}
}
}