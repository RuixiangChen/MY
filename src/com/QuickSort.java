package com;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={18,22,10,36,5,9,22,26,60,35,26,60,45};
		QuickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		
	}
	private static void QuickSort(int[] a,int p,int r)
	{
		if(p<r)
		{
			int q=Partition(a,p,r);
			QuickSort(a,p,q-1);
			QuickSort(a,q+1,r);
			
		}
	
	}

	public static int Partition(int[] a,int p,int r)
	{
		
		/*int l=(int)(p+Math.random()*(r-p+1));
		Swap(a[l],a[r]);//和最后一个值交换,作为划分元*/
		
		int i=p-1;
		for(int j=p;j<=r-1;j++)
		{
			if(a[j]<=a[r])
			{
				i++;
				int t=a[j];
				a[j]=a[i];
				a[i]=t;
			}
		}
		int t=a[r];
		a[r]=a[i+1];
		a[i+1]=t;
		
		return i+1;			
	}
	

}
