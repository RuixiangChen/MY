package com;

import java.util.Scanner;

public class Palindrome {
	private static int index=0;//最长回文子串的开始下标
	private static int maxlen=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext())
		{
			String s=sc.next();
			int len=s.length();
			if(len<2)
			{
				System.out.println(s); 
			}
			//对字符串进行遍历,(除最后一个),调用扩展回文序列函数
			for(int i=0;i<len-1;i++)
			{
				extendPalindrome(s,i,i);//获得子串为奇数个
				extendPalindrome(s,i,i+1);//获得子串为偶数个
			}
			System.out.println(s.substring(index,index+maxlen));
		}
		
	}
	
	//
	public static void extendPalindrome(String s,int j,int k)
	{
		while(j>=0&&k<s.length()&&s.charAt(j)==s.charAt(k))//向两边扩展
		{
			j--;
			k++;
		}
		if(maxlen<k-j-1)
		{
			index=j+1;
			maxlen=k-j-1;
		}
	}
	
}
