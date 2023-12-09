import java.util.*;
class userid
{
public static void main(String args[])
{
String  user1,user2;
Scanner s=new Scanner(System.in);
user1=s.nextLine();
user2=s.nextLine();
if(user1.equals(user2))
{
System.out.println("are equal");
}
else
{
System.out.println("are not equal");
}
}
}