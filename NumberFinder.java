import java.util.*;
import java.lang.*;
class NumberFinder
{
public static void main(String args[])
{
for(int num=10;num<=99;num++)
{
int a=num%10;
int b=num/10;
int sum=3*(a+b);
if(num==sum)
System.out.println("numbers:" +num);
}
}
}