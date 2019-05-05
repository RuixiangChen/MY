package com;

public class StaticLoad {
	
	public static StaticLoad staticLoad=new StaticLoad();
	public static int i;
	public static int j=0;
	//构造方法
	public StaticLoad()
	{
		i++;
		j++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		System.out.println(j);
	}

}
