import java.util.*;
class perfect
{
public static void main(String args[])
{
Scanner s = new Scanner (System.in);
int num, sum = 0 ;
num= s.nextInt();
for(int i=1;i<num;i++)
{
if(num%i==0)
{
sum=sum+i;
}
}
if(sum==num)
{
System.out.print("perfect num");
}else{
System.out.print("not perfect num");
}
}
}