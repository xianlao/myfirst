package com.atfuif;


 class share {

	 private int number = 100;
	 
	 public synchronized void addnumber (){
		 
		 while (number!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		 ++number;
		 System.out.println(Thread.currentThread().getName()+"生产者号为："+number);
		 
	 }
	 public synchronized void dirnumber (){
		 
		 while (number==0) {
			 try {
				 wait();
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		 --number;
		 System.out.println(Thread.currentThread().getName()+"消费者号为："+number);
		 
	 }
	
}
   class text{
	  
	  public static void main(String[] args) {
		
		  final share Share = new share();
		  
		  new Thread( new Runnable() {
			
			@Override
			public void run() {
				Share.addnumber();
				
			}
		}).start();
		  
	}
  } 
 