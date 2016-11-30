package com.bwie.digui;

import java.io.File;

public class Digui {
	/**
	 * 遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中
	 * @param args
	 */
	public static void main(String[] args) {
		 //递归显示C盘下所有文件夹及其中文件
		  File root = new File("d:\\学习练习资料");
		  showAllFiles(root);
	}
	private static void showAllFiles(File dir) {
		//先判断是否是文件夹
		if (dir.isDirectory()) {
			//如果是文件夹,把名字输出到控制台
			System.out.println("文件夹--"+dir);
			//得到文件夹中的东西 放到数组
			 File[] fs = dir.listFiles();
			  //遍历数组
			 for (File file : fs) {
				//调用自己的方法
				 showAllFiles(file);
			}
		}else{
			//如果是文件 打印文件名
			System.out.println("文件--"+dir);
		}
		
	}
	

}
