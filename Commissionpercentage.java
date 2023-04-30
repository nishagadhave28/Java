import java.util.Scanner;
class Commissionpercentage
{
public static void main(String arg[])
{
double com,amt;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the amount= ");
amt=sc.nextInt();
System.out.print("Enter the commission amount= ");
com=sc.nextInt();
double commission_percentage;
commission_percentage=(com/amt)*100;
System.out.println("The commission percentage="+commission_percentage+ "%");
}
}