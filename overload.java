import java.io.*;
import java.util.Scanner;
class compute
{
public void calculate(int n,int ch)
{
if(ch=='s')
{
System.out.println("square");
System.out.println(n*n);
}
else
{
System.out.println("cube");
System.out.println(n*n*n);
}
}
public void calculate(int n,int m,char ch)
{
if(ch=='p')
{
System.out.println("product of numbers");
System.out.println(n*m);
}
else
{
System.out.println("sum of numbers");
System.out.println(n+m);
}
}
public void calculate(String s1,String s2)
{
if((s1.equals(s2))==true)
{
System.out.println("strings are equal");
}
else
{
System.out.println("not equal");
}
}
}
class overload
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
Scanner sc=new Scanner(System.in);
System.out.println("enter character");
char ch1=sc.next().charAt(0);
System.out.println("enter number");
int n1=in.nextInt();
compute ol=new compute();
ol.calculate(n1,ch1);
System.out.println("enter n");
int n=in.nextInt();
System.out.println("enter m");
int m=in.nextInt();
System.out.println("enter character");
char ch2=sc.next().charAt(0);
ol.calculate(n,m,ch2);
System.out.println("enter string1");
String s1=in.next();
System.out.println("enter String2");
String s2=in.next();
ol.calculate(s1,s2);
}
}

