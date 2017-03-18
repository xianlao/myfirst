package com.atfuif;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*
	写一个Singleton出来
	Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。
	一般Singleton模式通常有几种种形式:
	第一种形式: 定义一个类，它的构造函数为private的，它有一个static的private的该类变量，在类初始化时实例话，通过一个public的getInstance方法获取对它的引用,继而调用其中的方法。*/
    
    //1、私有化构造器
    //2、在类中声明私有的静态引用变量并声明本类对象
    //3、建立公共的静态方法，并获取这个对象

	
	/*class Single{
	 	//private的构造器，不能在类的外部创建该类的对象
	     private Single() {} 
		 //私有的，只能在类的内部访问
	     private static Single onlyone = new Single();
	 	//getSingle()为static，不用创建对象即可访问
	     public static Single getInstance() {
			return onlyone;
	 	}
	}*/
	class textSingle{
		
		public static void main(String[] args) {
			
			Single a = Single.getInstance();
			Single b = Single.getInstance();
			System.out.println(a==b);
		}
	}
	
	
	
	    //第二种形式: 
	/*class Single{
		private Single(){}
		private static Single onlyone  =null;
		public static Single getInstance(){
			
			if (onlyone==null) {
				synchronized (Single.class) {
					if (onlyone==null){
					  onlyone= new Single();
					}
				}
			}
			return onlyone;
		}
	}*/
	
	class Single{
		
		private Single(){};
		
		private static Single onlyone = null;
		
		public static Single getInstance(){
			
			if (onlyone==null) {
				
				synchronized(Single.class){
					
					if (onlyone== null) {
						
						onlyone=new Single(){};
					}
					
				}
				
			}
			return onlyone;
		}
	}
  
	
	
