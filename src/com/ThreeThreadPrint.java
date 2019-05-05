package com;

public class ThreeThreadPrint implements Runnable {

	 //设置属性
    private String name;
    private Object prev;
    private Object self;  
    
    //构造函数
    public ThreeThreadPrint(String name,Object prev,Object self)
    {
    	this.name=name;
    	this.prev=prev;
    	this.self=self;
    }
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=10;
		while(count>0)
		{
			synchronized(prev)
			{
				synchronized(self)
				{
					System.out.print(name);
					count--;
					self.notify();//唤醒此对象上的线程
				}
				try {
					prev.wait();//在此对象上等待，直到被唤醒才继续循环，以此类推
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//创建三个对象，有三把对象锁 
		Object a=new Object();
		Object b=new Object();
		Object c=new Object();
		//创建三个线程
		ThreeThreadPrint thread1=new ThreeThreadPrint("A",c,a);
		ThreeThreadPrint thread2=new ThreeThreadPrint("B",a,b);
		ThreeThreadPrint thread3=new ThreeThreadPrint("C",b,c);
		 
		//启动线程
		new Thread(thread1).start();
		Thread.sleep(100);
		new Thread(thread2).start();
		Thread.sleep(100);
		new Thread(thread3).start();
		Thread.sleep(100);
	}







}
