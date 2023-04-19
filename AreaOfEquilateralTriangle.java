import java.util.*;
class AreaOfEquilateralTriangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double s,area;
System.out.println("Enter lenght of Equilateral Triangle=");
s=sc.nextDouble();
area=Math.sqrt(3)/4*s*s;
System.out.println("Area of Equilateral Triangle="+area);
}
}