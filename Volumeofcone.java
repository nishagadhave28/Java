import java.util.*;
class Volumeofcone
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double r,h,vl;
System.out.println("Enter radius of cone=");
r=sc.nextDouble();
System.out.println("Enter height of cone=");
h=sc.nextDouble();
vl=3.14*(r*r)*h/3;
System.out.println("Volume of cone="+vl);
}
}