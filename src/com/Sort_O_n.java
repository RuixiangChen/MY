package com;

public class Sort_O_n {
	static int max=99;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={18,22,10,36,5,9,22,26,60,35,26,60,45};
		
		//假设需排序的数的最大值为99
		int[] timeOf=new int[max+1];//相当于100个数，对给个数计数
		//数组记得初始化,都是0次
		for(int i=0;i<=max;i++)
		{
			timeOf[i]=0;
		}
		//遍历a数组
		for(int i=0;i<a.length;i++)
		{
			int t=a[i];//获得当前的数是多少
			//必要时判断数组中的数字是否合法
			if(t<0||t>max)
				System.out.println("数字不合法");
			timeOf[t]++;//次数加1
		}
      //遍历计数数组
		int index=0;
		for(int i=0;i<=max;i++)
		{
			for(int j=0;j<timeOf[i];j++)
			{
				a[index]=i;
				++index;//用前++以免下标溢出
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}

}
