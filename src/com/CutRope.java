package com;

import java.util.Scanner;

public class CutRope {//f(n)=max{f(i)*f(n-i)}绳子乘积最大

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
			int length=sc.nextInt();
			if(length<2)//要求把绳子剪成m段,m>1,剪出来的绳子长度为整数,相当于没有剪绳子
				System.out.println(0);
			if(length==2)
				System.out.println("这是1");
			if(length==3)//f(3)=max{f(1)*f(2),f(2)*f(1)} f(1)=1//剪绳子后有f(1)
				System.out.println("这是2");
			else
			{
				//动态规划需要将计算过的子问题记录下来（以空间换取时间来提高效率）
				int[] product=new int[100];//包含
				product[0]=0;
				product[1]=1;
				product[2]=2;//相当于子问题等于2时不再减了
				product[3]=3;//由于f(3)剪一刀后分的两部分只有一种情况，所以把长度为3的绳子另外计算。在存储子问题的解时，子问题可以不用必须剪一刀，所以要在之前的基础上都加1
				
				int max=0;//定义最大值
				//从长度为4开始循环
				for(int i=4;i<=length;i++)
				{
					max=0;
					for(int j=1;j<=i/2;j++)//f(i)=max{f(j)*f(i-j)}绳子乘积最大,j到中间即可
					{
						int temp=product[j]*product[i-j];
						if(max<temp)
						{
							max=temp;
						}
						product[j]=max;
					}
				}
				max=product[length];
				System.out.println(max);
			}
			
		}
		
	

}
