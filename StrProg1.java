import java.io.*;
class StrProg1{
public static void main(String args[]) throws IOException{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String str1,str2,str3;
int len1,len2;

System.out.println("enter first string:");
str1=br.readLine();
System.out.println("enter second string:");
str2=br.readLine();

len1=str1.length();
System.out.println("First string: " +str1+ " length is "+len1);

len2=str2.length();
System.out.println("second string:"+str1+" length is "+len2); 

str3=str1.concat(str2);
System.out.println("concatinated string: "+str3);

}
}