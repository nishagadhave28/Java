import java.util.*;
class AreaOfIsoscelesTriangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double b,h,area;
System.out.println("Enter base of isosceles triangle=");
b=sc.nextDouble();
System.out.println("Enter height of isosceles triangle=");
h=sc.nextDouble();
area=(1*b*h)/2;
System.out.println("Area of isosceles triangle="+area);
}
}