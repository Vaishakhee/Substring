class Trim
{
public static void main(String args[])
{
String s1="    Mahatma Gandhi    ";
String s2="MaHATMA";
String s3="gandhi";
String r1, r2, r3;

r1=s1.trim();
System.out.println(r1);

r2=s2.toLowerCase();
System.out.println(r2);

r3=s3.toUpperCase();
System.out.println(r3);
}
}