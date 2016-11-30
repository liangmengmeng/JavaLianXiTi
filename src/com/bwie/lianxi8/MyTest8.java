package com.bwie.lianxi8;

import java.util.Scanner;
/**
 * 计算字符串中子串出现的次数
 * Java中字符串中子串的查找共有四种方法，如下：
 1、int indexOf(String str) ：返回第一次出现的指定子字符串在此字符串中的索引。
 2、int indexOf(String str, int startIndex)：从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。
 3、int lastIndexOf(String str) ：返回在此字符串中最右边出现的指定子字符串的索引。
 4、int lastIndexOf(String str, int startIndex) ：从指定的索引处开始向后搜索，返回在此字符串中最后一次出现的指定子字符串的索引。
 * 1.计算字符串中子串出现的次数
 */
 /**
 * API中String的常用方法
 */

public class MyTest8 {
	
    // 查找指定字符串是否存在

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("请输入字符串：");
	    String str1 = s.nextLine();
	    System.out.print("请输入子串：");
	    String str2 = s.nextLine();
	int count=0;
	if(str1.equals("")||str2.equals(""))
	   {
	   System.out.println("你没有输入字符串或子串,无法比较!");
	   System.exit(0);
	   }
	else
	   {
	    for(int i=0;i<=str1.length()-str2.length();i++)
	     {
	     if(str2.equals(str1.substring(i, str2.length()+i)))
	      //这种比法有问题，会把"aaa"看成有2个"aa"子串。
	       count++;
	       }
	System.out.println("子串在字符串中出现: "+count+" 次");
	}
	}
	
   
}
