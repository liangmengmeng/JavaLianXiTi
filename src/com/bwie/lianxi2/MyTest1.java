package com.bwie.lianxi2;

import java.util.Scanner;

//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数

public class MyTest1 {
	public static void main(String[] args) {
		 int i; 
	        int LetterCount = 0; 
	        int SpaceCount = 0; 
	        int NumberCount = 0; 
	        int OtherCount = 0; 
	         
	        //输入一个字符串 
	        Scanner in = new Scanner(System.in); 
	        System.out.println("请输入一个字符串:"); 
	        String str = in.nextLine(); 
	         
	        //字符串转换成字符数组 
	        char[]ch = str.toCharArray(); 
	        for(i = 0; i<str.length();i++){ 
	            if(Character.isLetter(ch[i])){ 
	                LetterCount++; 
	            }else if(Character.isSpaceChar(ch[i])){ 
	                SpaceCount++; 
	            }else if(Character.isDigit(ch[i])){ 
	                NumberCount++; 
	            } 
	            else{ 
	                OtherCount++; 
	            } 
	        } 
	        System.out.println("字符的个数为:"+LetterCount); 
	        System.out.println("空格的个数为:"+SpaceCount); 
	        System.out.println("数字的个数为:"+NumberCount); 
	        System.out.println("其他字符个数为:"+OtherCount); 
	}

}
