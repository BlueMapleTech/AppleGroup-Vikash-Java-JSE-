package program;
import java.util.*;
public class Dymond2 {

	public static void main(String args[])throws Exception
	{
	Scanner scr=new Scanner(System.in);
	String n;
	System.out.println("Enter the String. ");
	n=scr.nextLine();
	int noOfcolumns=n.length();
	for(int i=1;i<=n.length();i++)
	{
	for(int j=0;j<noOfcolumns;j++)
	{
	System.out.print(" ");


	}
	noOfcolumns=noOfcolumns-1;
	for(int k=0;k<i;k++)
	{
	System.out.print(" "+n.charAt(k));
	}

	System.out.println("");
	}
	int x=n.length()-1;
	int h=x+x;

	int r=0;
	int c=x;
	for(int i=x;i<h;i++)
	{

	r=r+1;
	for(int j=0;j<=r;j++)
	{
	System.out.print(" ");

	}

	for(int k=0;k<c;k++)
	{
	System.out.print(" "+n.charAt(k));
	}

	System.out.println("");

	c=c-1;


	}

	}
	}


