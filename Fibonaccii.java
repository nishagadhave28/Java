import java.util.*;
class Fibonaccii
{
public static void main(String args[])
{
int x=0,y=1,z=0;
while(z<=21)
{
System.out.println(z);
x=y;
y=z;
z=x+y;
}
}
}