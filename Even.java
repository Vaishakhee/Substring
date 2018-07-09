import java.io.*;
class Even
{
public static void main(String args[]) throws IOException
{
int a;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);

String s;
System.out.println("Enter a no: ");
s=br.readLine();
a=Integer.parseInt(s);

if(a%2==0)
System.out.println("Even number");
else
System.out.println("odd number");
}
}
 