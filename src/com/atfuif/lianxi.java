package com.atfuif;

public class lianxi {

	public static void main(String[] args) {
		
		int f1=1,f2=1,f,m=24 ;

		for (int i = 3; i < m; i++) {
			System.out.println("___________________��ʼ");
			f = f2;
			
			System.out.println(f+","+f1+","+f2);
			f2 = f1+f2;
			
			f1=f;
			System.out.println("��"+i+"������"+f2+"���ñ���");
			System.out.println("------------------------����");
		}
				
	}

}
