package com.atfuif;

		class Ticket implements Runnable{
		    private  int tick = 30;
		    public synchronized void run(){
		    while(true){
		        if(tick>0){
		         System.out.println(Thread.currentThread().getName()+"售出车票，tick号为："+ tick--);
		        }
		       else
		            break;
		     }
		  }
		}
