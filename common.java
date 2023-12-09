import java.util.*;
class common
{
public static void main(String args[])
{

int[] arrone=new int[5];
int[] arrtwo=new int[5];
int i,j;
Scanner s = new Scanner(System.in);
System.out.print("enter elements");
for(i=0;i<5;i++)
arrone[i]=s.nextInt();
System.out.print("\nenter elements");
for(i=0;i<5;i++)
arrtwo[i]=s.nextInt();
System.out.println("\n common elements : ");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if(arrone[i]==arrtwo[j])
System.out.print(arrone[i]+" ");
}
}
}
}