import java.util.*;
class star8
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int i,j;
int n = s.nextInt();
for(i=n;i>=1;i--)
{
for(j=n;j>=i;j--)
{
System.out.print(" ");
}
for(j=i;j>=1;j--)
{
System.out.print(" *");
}
System.out.println();
}
}
}