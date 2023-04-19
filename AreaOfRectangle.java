import java.util.*;
class AreaOfRectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double w,h,area;
System.out.println("Enter width of rectangle=");
w=sc.nextDouble();
System.out.println("Enter height of rectangle=");
h=sc.nextDouble();
area=w*h;
System.out.println("Area of rectangle="+area);
}
}