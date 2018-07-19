import java.util.*;
class ScanToken
{
public static void main(String args[])
{
String data="21 4 32 87 123";
Scanner scan=new Scanner(data);
int a,b,c,result;
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
result=a+b+c;
System.out.println(result);
}
}