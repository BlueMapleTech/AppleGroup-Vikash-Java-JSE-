package com.magicprogram;
import java.util.*;
class Magic
{
     public static void main(String[ ] args)
     {
           int [ ][ ] number= {
                               
                            { 1,2,3,4},
                            { 5, 6, 7,8 },
                            { 9,10,11,12},{13,14,15,16} 
  
                            };

           for (int i = 0; i < number.length; i++)
           {
                  for (int j = 0; j < number.length; j++)
                  {
				  System.out.print(number[ i ][ j ] + " ");
				  }
                 System.out.println( );
           }

Scanner in=new Scanner(System.in);
System.out.println("enter the row:");
int n=in.nextInt(); 

  int [ ][ ] number1= {

                            { 1,6,5,12},
                            { 2, 7, 10,13 },
                            { 3,8,15,14}, 
							{4,9,11,12}};

           for (int k = 0; k < number1.length; k++)
           {
                  for (int l= 0; l < number1.length; l++)
                  {
                             System.out.print(number1[ k][ l ] + " ");
                             
                  }
                 System.out.println( );
           }
		   System.out.println("enter the row");
		   int m=in.nextInt();
int c=0;

		 int w=0;		   
for(int p=0;p<4;p++)
{
	for(int q=0;q<4;q++)
	{
	if(number[n][p]==number1[m][q])	
	{
	c=c+1;
	w=number[n][p];
	}
	}
}
	if(c==1)
	{
		System.out.println("the value is"+" "+w);
	}
	else
	if(1<c)
	{
		System.out.println("bad ");
	}
	else
	if(c==0){
		System.out.println("cheated");
	}
	}
	}
	
    
     
                  

 

