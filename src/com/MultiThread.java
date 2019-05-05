package com;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用打印函数
		final Print print=new Print();
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<3;i++)
				{
					print.print_A();
				}
			}
			
		}).start();
		
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<3;i++)
				{
					print.print_B();
					
				}
			}
			
		}).start();
		
	}

}

class Print{
	private boolean flag=true;//用来标记应该进入哪个同步的方法
	
	public synchronized void print_A()
	{
		while(!flag)//flag为false进入该循环,即A不打印
		{
			try{
				this.wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		System.out.print("A");
		
		flag=false;
		this.notify();
	}
	
	public synchronized void print_B() 
	{
		while(flag)
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("B");
	    flag=true;
	    this.notify();
	    
	}
}
