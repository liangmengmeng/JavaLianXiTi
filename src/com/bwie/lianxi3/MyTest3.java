package com.bwie.lianxi3;

//�ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
//С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�������
//��ÿ���µ���������Ϊ���٣�
import java.util.Scanner;

public class MyTest3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ���������:"); 
		int m=input.nextInt();
		int i=1;
		int[] arr=new int[m+1];
		for(i=1;i<m+1;i++)
		{
		if(i==1|i==2)
		arr[1]=arr[2]=1; 
		else
		arr[i]=arr[i-2]+arr[i-1];
		}
		for(i=1; i<m+1;i++)
		{
		System.out.println("��" + i +"�µ�������ĿΪ:" + arr[i]); 
		}

	}

}
