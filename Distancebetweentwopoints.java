import java.util.Scanner;
class Distancebetweentwopoints
{
public static void main(String[] args)
{
double n1,m1,n2,m2,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n and m for the first point:");
n1 = sc.nextDouble();
m1 = sc.nextDouble();
System.out.println("Enter the value of n and m for the second point:");
n2 = sc.nextDouble();
m2 = sc.nextDouble();
d = Math.sqrt(Math.pow((n2 - n1),2)+Math.pow((m2-m1),2));
System.out.println("The distance between the points is:"+d);
}
}