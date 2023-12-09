import java.util.*;
class alpha
{
public static void main(String args[])
{
int n=5;
String  names[]=new String[10];
Scanner s=new Scanner(System.in);
System.out.println("enter names");
for(int i=0;i<n;i++)
{
names[i]=s.nextLine();
}
String temp;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(names[i].compareTo(names[j])>0)
{
temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
System.out.println("the names in alphabetical order are :");
for(int i=0;i<n;i++)
{
System.out.println(names[i]);
}
}
}