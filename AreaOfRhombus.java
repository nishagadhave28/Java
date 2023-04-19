import java.util.*;
class AreaOfRhombus
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double d1,d2,area;
System.out.println("Enter diagonal1 of Rhombus =");
d1=sc.nextDouble();
System.out.println("Enter diagonal2 of Rhombus =");
d2=sc.nextDouble();
area=(d1*d2)/2;
System.out.println("Area of Rhombus="+area);
}
}