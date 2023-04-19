import java.util.*;
class AreaOfCircle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double r,area;
System.out.println("Enter radius of circle=");
r=sc.nextDouble();
area=3.14*r*r;
System.out.println("Area of circle="+area);
}
}