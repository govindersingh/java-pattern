import java.util.Scanner;

class name
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

System.out.println("enter your name:");
String name=sc.next();

int n=0;
String star="*";

while(n<name.length()-n);
{
System.out.print(name.charAt(n)+star);
n++;
}
System.out.print(name.charAt(n));

}
}