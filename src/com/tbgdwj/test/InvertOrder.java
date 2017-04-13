package com.tbgdwj.test;

public class InvertOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = dz(712483);  
        System.out.println(num);  
	}
	
    private static int dz(int i){  
        String te="";  
          if (i>10) {  
           te+=dz(i/10)+"";  
          }  
          return Integer.parseInt((i%10)+te);  
    }  

}
