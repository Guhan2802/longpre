import java.util.*;
class longpre
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
if(s1.charAt(0)!=s2.charAt(0))
{
System.out.println(""+s1+ " and "+s2+ "have no common prefix");
System.exit(0);
}
if(s1.charAt(0)==s2.charAt(0))
System.out.println(" "+s1.charAt(0));
if(s1.charAt(0)==s2.charAt(0))
System.out.println(" "+s1.charAt(1));
if(s1.charAt(0)==s2.charAt(0))
System.out.println(" "+s1.charAt(2));
}
}
