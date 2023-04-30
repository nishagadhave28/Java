import java.util.Scanner;
class Battingaverage
{
public static void main(String arg[])
{
int totMatches,totRuns,inn,notOut;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of total matches played=");
totMatches=sc.nextInt();
while(true)
{
System.out.println("Enter the number of total innings played=");
inn=sc.nextInt();
if(inn<=totMatches)
{
break;
}
}
System.out.println("Enter total run scored= ");
totRuns=sc.nextInt();
System.out.println("Enter the number of notout= ");
notOut=sc.nextInt();
double avg;
avg=totRuns/(inn-notOut);
System.out.println("Batting average= "+avg);
}
}