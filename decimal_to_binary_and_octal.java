import java.util.*;
class decimal_to_binary_and_octal
{
Scanner s = new Scanner(System.in);
void binary()
{

int num,a;
String c="";
num=s.nextInt();
while(num>0)
{
a=num%2;
c=Integer.toString(a)+c;
num=num/2;
}
System.out.println(c);

}
void octal()
{
int num,a;
String c="";
num=s.nextInt();
while(num>0)
{
a=num%8;
c=Integer.toString(a)+c;
num=num/8;
}
System.out.println(c);
}
public static void main(String args[])
{
decimal_to_binary_and_octal obj = new decimal_to_binary_and_octal();
obj.binary();
obj.octal();
}
}