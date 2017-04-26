package com.tbgdwj.test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] b={{11},{21,22},{31,32,33}};
		//用二重循环求出二维数组b所有元素的和
		int tmp=arraySum(b);
		System.out.println(tmp);
	}

	public static int arraySum(int[][] arr){
		int sum =0;
		for(int i=0;i < arr.length;i++){			
			for(int j=0;j < arr[i].length;j++){
				sum= sum + arr[i][j];
			}
		}
		return sum;
	}
	
}
