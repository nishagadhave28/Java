import java.util.*;
class AreaOfParallelogram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double b,h,area;
System.out.println("Enter base of Parallelogram =");
b=sc.nextDouble();
System.out.println("Enter height of Parallelogram=");
h=sc.nextDouble();
area=b*h;
System.out.println("Area of Parallelogram="+area);
}
}