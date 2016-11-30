package com.bwie.lianxi5;

import java.util.Scanner;

public class MyTest5 {

	/**
	 * 求1+2!+3!+...+20!的和
	 * @param args
	 */
	public static void main(String[] args) {
		        int sum = 0;
		        System.out.println("请输入多少项阶乘的和:");
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int an = 0;

		        for(int i = 1;i <= n + 1;i++){
		            if(i == n + 1){
		                sum += an;
		            }else if(i == n){
		                sum += an;
		                an = 1;
		                System.out.print(i+"!");
		                for(int j = i;j >= 1;j--){
		                    an *=j;
		                }
		            }else if(i%10 == 0){
		                System.out.println();
		                sum += an;
		                an = 1;
		                System.out.print(i+"!"+"+");
		                for(int j = i;j >= 1;j--){
		                    an *=j;
		                }
		            }else{
		                sum = sum + an;
		                an = 1;
		                System.out.print(i+"!"+"+");
		                for(int j = i;j >= 1;j--){
		                    an *=j;
		                }
		            }
		        }System.out.println(" = "+sum);

		    }

	

}
