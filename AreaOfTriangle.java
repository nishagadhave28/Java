import java.util.*;
class AreaOfTriangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double b,h,area;
System.out.println("Enter base and height of triangle=");
b=sc.nextDouble();
h=sc.nextDouble();
area=(b*h)/2;
System.out.println("Area of Triangle="+area);
}
}