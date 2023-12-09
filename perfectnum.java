import java.util.*;
class perfectnum
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int num,sum=0;
num=s.nextInt();
for(int i=1;i<=num/2;i++)
{
if(num%i==0)
{
sum+=i;
}
}
if(num==sum)
{
System.out.println("perfect number");
}else{
System.out.println("not a perfect number");
}
}
}
