package com;

public class StaticParent {
	private static String strPaSta="0";
	private static String strPaIns="1";
	
	//静态代码块
	static{
		System.out.println("进入父静");
		System.out.println("strPa："+strPaSta);
	}
	
	//父类构造函数
	public StaticParent(){
		System.out.println("进入父类构造函数");
        System.out.println("父类构造函数 strPar："+strPaSta);
        System.out.println("父类构造函数 strPaIns："+strPaIns);
	}
	
	//普通代码块
	{
		System.out.println("进入父类代码块");
        System.out.println("父类代码块 strParIns："+strPaIns);
	}
	
	//父类函数
	public void sout()
	{
		System.out.println("输出");
	}
}


