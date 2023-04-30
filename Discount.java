import java.util.Scanner;
class Discount
{
public static void main(String[] args) 
{
int p;
int dis;
Scanner sc = new Scanner(System.in);
System.out.println("Enter price of the product :");
p= sc.nextInt();
System.out.println("Enter Discount of the product :");
dis = sc.nextInt();
int finalPrice = (p* dis) / 100;
System.out.println("Final price is " + finalPrice);
}
}