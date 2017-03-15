package com.tbgdwj.test;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list1 =new ArrayList<String>();
        List<String> list2 =new ArrayList<String>();
        
        list1.add("abc1");
        list1.add("abc2");
        list1.add("abc3");
        
        list2.add("abc2");
        list2.add("abc3");
        list2.add("abc5");   
        
        System.out.println(list1);
        System.out.println(list2);
//        System.out.println(list1.addAll(list2));
               
//        list1.clear();
//        System.out.println(list1);
        
//        list1.removeAll(list2);
//        System.out.println(list1);
        
//        System.out.println(list1.containsAll(list2));
//        System.out.println(list1.toString());
                
//       Iterator<String> it=list1.iterator(); 
//       while(it.hasNext()){
//    	 System.out.println(it.next());  
//       }
       
       //用这种较好,没有多余对象产生
//       for (Iterator<String> iterator = list2.iterator(); iterator.hasNext();) {
//		 System.out.println(iterator.next());		
//	   }
        
//       for (ListIterator<String> it = list2.listIterator(); it.hasNext();) {
//    	 String str =it.next();
//    	 if (str.equals("abc3")){
//    	   list2.add("abc4"); 
//    	 }
//   		 //System.out.println(iterator.next());		
//   	   }
        
		// 获取列表迭代器
		ListIterator<String> it=list2.listIterator();
		
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj.equals("abc2"))
			{
				it.add("hello");
			}
			System.out.println(obj);
		}
		System.out.println(list2);      
       
	}

}
