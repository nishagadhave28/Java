import java.util.*;
class Volumeofcylinder
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double r,h,vl;
System.out.println("Enter radius of cylinder=");
r=sc.nextDouble();
System.out.println("Enter height of cylinder=");
h=sc.nextDouble();
vl=3.14*(r*r)*h;
System.out.println("Volume of cylinder="+vl);
}
}