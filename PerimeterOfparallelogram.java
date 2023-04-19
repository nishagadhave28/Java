import java.util.*;
class PerimeterOfparallelogram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double h,b,pr;
System.out.println("Enter height of parallelogram=");
h=sc.nextDouble();
System.out.println("Enter breadth of parallelogram=");
b=sc.nextDouble();
pr=2*(h+b);
System.out.println("Perimeter of parallelogram="+pr);
}
}