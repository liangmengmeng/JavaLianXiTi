package com.bwie.digui;

import java.io.File;

public class Digui {
	/**
	 * ������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı���
	 * @param args
	 */
	public static void main(String[] args) {
		 //�ݹ���ʾC���������ļ��м������ļ�
		  File root = new File("d:\\ѧϰ��ϰ����");
		  showAllFiles(root);
	}
	private static void showAllFiles(File dir) {
		//���ж��Ƿ����ļ���
		if (dir.isDirectory()) {
			//������ļ���,���������������̨
			System.out.println("�ļ���--"+dir);
			//�õ��ļ����еĶ��� �ŵ�����
			 File[] fs = dir.listFiles();
			  //��������
			 for (File file : fs) {
				//�����Լ��ķ���
				 showAllFiles(file);
			}
		}else{
			//������ļ� ��ӡ�ļ���
			System.out.println("�ļ�--"+dir);
		}
		
	}
	

}
