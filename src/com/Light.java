package com;
import java.util.Scanner;
public class Light{
     public static void main(String[] args)
	    {
    	 Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         for(int i=0;i<t;i++)
         {
             int n=sc.nextInt();
             String s=sc.next();
             for(int j=0;j<n;j++)
             {
            	 System.out.println(s.charAt(j));
             }
             
         }

    		 /*Scanner scanner=new Scanner(System.in);
    		     int n=scanner.nextInt();
    		     for(int i=0;i<n;i++){
    		         int count=0;
    		         int length=scanner.nextInt();
    		         String roadString=scanner.next();    
    		         for(int j=0;j<length;){
    		             char[] light=new char[length];
    		             light[j]=roadString.charAt(j);
    		             if(light[j]=='.'){
    		                 j+=3;
    		                 count++;
    		             }
    		             else j+=1;
    		         }
    		         System.out.println(count);                        
    		     }*/
	    }
}

