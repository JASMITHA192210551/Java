import java.util.*;
class revstring
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
String s1;
s1=s.nextLine();
int k=s1.length();
char p=' ';
String s2=" ";
for(int i=0;i<k;i++)
{
p=s1.charAt(i);
s2=p+s2;
}
System.out.print("reverse string is " +s2);
}
}