package com.bwie.lianxi2;

import java.util.Scanner;

//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���

public class MyTest1 {
	public static void main(String[] args) {
		 int i; 
	        int LetterCount = 0; 
	        int SpaceCount = 0; 
	        int NumberCount = 0; 
	        int OtherCount = 0; 
	         
	        //����һ���ַ��� 
	        Scanner in = new Scanner(System.in); 
	        System.out.println("������һ���ַ���:"); 
	        String str = in.nextLine(); 
	         
	        //�ַ���ת�����ַ����� 
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
	        System.out.println("�ַ��ĸ���Ϊ:"+LetterCount); 
	        System.out.println("�ո�ĸ���Ϊ:"+SpaceCount); 
	        System.out.println("���ֵĸ���Ϊ:"+NumberCount); 
	        System.out.println("�����ַ�����Ϊ:"+OtherCount); 
	}

}
