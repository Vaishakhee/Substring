import java.io.*;
class Expr
{
public static void main(String args[])throws IOException
{
double a=0.0, b=0.0;

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s=new String();

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s=new String();

System.out.println("Enter Value of a:");
s=br.readLine();
a=Double.parseDouble(s);

System.out.println("Enter value of b:");
s=br.readLine();
b=Double.parseDouble(s);

double a1=Math.cos(a);
double a2=Math.sin(b);
double r=Math.sqrt(a1+a2);
System.out.println("Result is "+r);

}
}