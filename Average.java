import java.util.Scanner; 
class Average
{ 
public static void main(String[] args) 
{ 
Scanner sc =new Scanner(System.in);
int count,number,sum=0; 
System.out.print("Enter total count of numbers : ");
count =sc.nextInt();
System.out.print("Enter numbers :"); 
for(int i=1;i<=count; i++) 
{ 
number=sc.nextInt(); 
sum =sum+number; 
} 
double avg= (double)sum/count;
System.out.println("Average of " + count + " Numbers = " + avg); 
} 
}