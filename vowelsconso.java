import java.util.*;
class vowelsconso
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String name, vowels = "", consonants="";
name=s.nextLine().toLowerCase();
int ccount=0,vcount=0;
int length=name.length();
for(int i=0;i<=length-1;i++)
{
char j=name.charAt(i);
if(j=='a' || j=='e' || j=='i'|| j=='o' || j=='u')
{
vowels = vowels + j + " ";
}else{
consonants = consonants + j + " ";
}
}
System.out.println(" vowels are  : "+vowels);
System.out.println(" consonants are  : "+ consonants);

}
}