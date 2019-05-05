package com;

public class Sprudelnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={18,22,10,36,5,9,22,26,60,35,26,60,45};
		int k=0,flag=a.length;
		while(flag>0)
		{
			k=flag;
			flag=0;
			for(int i=1;i<k;i++)
			{
				if(a[i-1]>a[i])
				{
					int temp=a[i];
					a[i]=a[i-1];
					a[i-1]=temp;
					flag=i;
				}	
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		
		
	}

}
