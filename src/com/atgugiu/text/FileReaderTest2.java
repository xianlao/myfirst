package com.atgugiu.text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	//../text/src/com/atfuif/lianxi.java
	public static void main(String[] args) {

		//FileReader fReader = null;
		FileReader fileReader =null;
		
		try {
			int line =1;
			
			fileReader= new FileReader("../text/src/com/atfuif/lianxi.java");
			
			char[] buf = new char[100];
			
			int read = fileReader.read(buf);
			
			while (read !=-1) {

				for (int i = 0; i < read; i++) {
					System.out.print(buf[i]);
				}
				
				 read = fileReader.read(buf);
			}
		}  catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileReader !=null ) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}}	
		/*try {
			int line = 1;
			fReader = new FileReader("../text/src/com/atfuif/lianxi.java");
			char[] buf = new char[100];
			int realCount = fReader.read(buf);
			while (realCount != -1) {
				// 处理已经读的数据
				for (int i = 0; i < realCount; i++) {
					System.out.print(buf[i]);
					if (buf[i] == 10) {
						System.out.print(line++ + " ");
					}
				}
				// 继续读后面的数据
				realCount = fReader.read(buf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fReader != null) {
				try {
					fReader.close();
				} catch (Exception e2) {
				}
			}
		}
	}*/
		
		
		
	


