import java.util.*;
class Volumeofsphere
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double r,vl;
System.out.println("Enter radius of sphere=");
r=sc.nextDouble();
vl=(4.0/3.0)*3.14*(r*r*r);
System.out.println("Volume of sphere="+vl);
}
}