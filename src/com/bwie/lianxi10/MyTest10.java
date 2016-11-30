package com.bwie.lianxi10;

public class MyTest10 {

	/**
	 * 求100之内的素数    //使用除sqrt(n)的方法求出的素数不包括2和3 
	 * @param args
	 */
	public static void main(String[] args) {
		  /*
	        * 定义变量
	        * k_输出的素数的数量
	        * i_定义为2，
	        * */
	        int i,n,k=0;
	        for (n = 3; n <= 100; n++) {
	            i=2;
	            while (i<n){
	                if (n%i==0){
	                    break;//若能整除说明n不是素数，跳出当前while循环，不执行后边的i++
	                }
	                i++;
	            }
	            //判断i是否=n
	            if (i == n){//如果i==n则说明n不能被2~n-1整除，是素数
	                k++; //统计输出的个数
	                System.out.print(i+"\t");
	                if (k%6 == 0){//没输出5个则换行
	                    System.out.println();
	                }
	            }
	        }
	    }

	
	

}
