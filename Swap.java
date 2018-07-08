import java.io.*;
class Swap
{
public static void main(String args[])throws IOException
{
int a,b;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s,r;

System.out.println("enter 11st value:");
s=br.readLine();
a=Integer.parseInt(s);

System.out.println("enter 2nd value:");
r=br.readLine();
b=Integer.parseInt(r);

a=a+b;
b=a-b;
a=a-b;
System.out.println("after swap:a= " +a+ "b=" +b);

}}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             