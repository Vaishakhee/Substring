class prime
{
public static void main(String args[])
{
int i;
for(int n=2;n<=50;n++)
{
i=2;
while(n%i!=0)
i++;
if(i==n)
System.out.println(" "+n);
}
}
}