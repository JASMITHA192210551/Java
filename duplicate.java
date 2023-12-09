import java.util.*;
class duplicate
{
public static void main(String args[])
{
int n;
Scanner s = new Scanner(System.in);
System.out.println("enter the no of elements : ");
n=s.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++)
{
System.out.print("enter element"+ (i+1) +":");
arr[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
for(int k=j;k<n-1;k++)
{
arr[k]=arr[k+1];
}
n--;
j--;
}
}
}
System.out.println("non duplicate items:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]);
}
}
}