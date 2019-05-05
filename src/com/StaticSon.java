package com;

public class StaticSon extends StaticParent{
	static String strSon = "子类静态成员变量";
    String strSonIns = "子类成员变量";
    public StaticSon() {
        System.out.println("进入子类构造函数");
        System.out.println("子类构造函数 strSon："+strSon);
        System.out.println("子类构造函数 strSonIns："+strSonIns);
    }
    static {
        System.out.println("进入子类静态代码块");
        System.out.println("子类静态代码块 strSon："+strSon);
    }
    {
        System.out.println("进入子类代码块");
        System.out.println("子类代码块 strSonIns："+strSonIns);
    }
 
    public static void main(String[] args) {
    	StaticParent son = new StaticSon();
        son.sout();
    }
}
