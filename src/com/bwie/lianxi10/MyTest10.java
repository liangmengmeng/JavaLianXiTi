package com.bwie.lianxi10;

public class MyTest10 {

	/**
	 * ��100֮�ڵ�����    //ʹ�ó�sqrt(n)�ķ������������������2��3 
	 * @param args
	 */
	public static void main(String[] args) {
		  /*
	        * �������
	        * k_���������������
	        * i_����Ϊ2��
	        * */
	        int i,n,k=0;
	        for (n = 3; n <= 100; n++) {
	            i=2;
	            while (i<n){
	                if (n%i==0){
	                    break;//��������˵��n����������������ǰwhileѭ������ִ�к�ߵ�i++
	                }
	                i++;
	            }
	            //�ж�i�Ƿ�=n
	            if (i == n){//���i==n��˵��n���ܱ�2~n-1������������
	                k++; //ͳ������ĸ���
	                System.out.print(i+"\t");
	                if (k%6 == 0){//û���5������
	                    System.out.println();
	                }
	            }
	        }
	    }

	
	

}
