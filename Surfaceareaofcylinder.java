import java.util.*;
class Surfaceareaofcylinder
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double r,h,tcs;
System.out.println("Enter radius of cylinder=");
r=sc.nextDouble();
System.out.println("Enter height of cylinder=");
h=sc.nextDouble();
tcs=((2*22*r)/7)*(r+h);
System.out.println("Total surface area of cylinder="+tcs);
}
}