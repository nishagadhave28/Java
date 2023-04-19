import java.util.*;
class Volumeofprism
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double l,w,h,vl;
System.out.println("Enter width of prism=");
w=sc.nextDouble();
System.out.println("Enter height of prism=");
h=sc.nextDouble();
System.out.println("Enter lenght of prism=");
l=sc.nextDouble();
vl=l*w*h;
System.out.println("Volume of prism="+vl);
}
}