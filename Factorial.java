import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double i,n,fact=1;
System.out.println("Enter a no=");
n=sc.nextDouble();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of number="+fact);
}
}