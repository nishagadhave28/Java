import java.util.*;
class Perimeterofrectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double l,b,pr;
System.out.println("Enter lenght of rectangle=");
l=sc.nextDouble();
System.out.println("Enter bridth of rectangle=");
b=sc.nextDouble();
pr=2*(l+b);
System.out.println("Perimeter of rectangle="+pr);
}
}