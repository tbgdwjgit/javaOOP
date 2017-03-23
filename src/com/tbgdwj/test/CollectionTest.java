package com.tbgdwj.test;

import java.util.*;
import com.tbgdwj.mybatis.User;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list1 =new ArrayList<String>();
        List<String> list2 =new ArrayList<String>();
        
//        list1.add("abc1");
//        list1.add("abc2");
//        list1.add("abc3");
//        
//        list2.add("abc2");
//        list2.add("abc3");
//        list2.add("abc5");   
//        
//        System.out.println(list1);
//        System.out.println(list2);
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
       
       //�����ֽϺ�,û�ж���������
//       for (Iterator<String> iterator = list2.iterator(); iterator.hasNext();) {
//		 System.out.println(iterator.next());		
//	   }
        
//       for (ListIterator<String> it = list2.listIterator(); it.hasNext();) {
//    	 Object str =it.next();
//    	 if (str.equals("abc3")){
//    	   it.add("abc4"); 
//    	 }
//   		 //System.out.println(iterator.next());		
//   	   }
//       System.out.println(list2); 
//       
//		// ��ȡ�б�����
//		ListIterator<String> it=list2.listIterator();
//		
//		while(it.hasNext()){
//			Object obj=it.next();
//			if(obj.equals("abc2")){
//				it.add("abc4");
//			}
//			//System.out.println(obj);
//		}
//		System.out.println(list2);  
        
        list2.add("abc2");
        list2.add("abc3");
        list2.add("abc2");         
        list2.add("abc2");
        list2.add("abc3");
        list2.add("abc5"); 
        list2.add("abc4");         
        list2.add("abc2");        
        System.out.println(list2);
        
//		for(int i=0;i<list2.size()-1;i++){
//			for(int j=i+1;j<list2.size();j++){
//				if(list2.get(i).equals(list2.get(j))){
//					list2.remove(j);
//					j=j-1;
//				}
//				
//			}
//		}
//		System.out.println(list2); 

        List<String> tmpList = new ArrayList<String>();
        for (int i = 0; i < list2.size()-1; i++) {
        	if(!tmpList.contains(list2.get(i))){
        		tmpList.add(list2.get(i));
        	}
		}
        //System.out.println(tmpList); 
        list2.clear();
        list2.addAll(tmpList);
        System.out.println(list2);
        
        LinkedList<String> link =new LinkedList<String>(); 
        link.addFirst("2212");
        link.addFirst("2213");
        link.addFirst("2214");
        System.out.println(link.toString());
        
//        System.out.println(link.removeFirst());
//        System.out.println(link.removeFirst());
//        System.out.println(link.removeFirst());
                
//        System.out.println(link.removeLast());
//        System.out.println(link.removeLast());
//        System.out.println(link.removeLast());
        
//        for (Iterator iterator = link.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
        
        //for (int i = link.size()-1; i >= 0; i--) {
        while (!link.isEmpty()) {
        	System.out.println(link.removeLast());
		}
        
        //HashSet
        HashSet<String> hs = new HashSet<String>();
        hs.add("asas");
        hs.add("q123");       
        hs.add("as1as");        
        hs.add("sdds");
        hs.add("asas");
        
        for (Iterator<String> it = hs.iterator(); it.hasNext();) {
			System.out.println(it.next());			
		}
        
        //TreeSet
        TreeSet<String> ts = new TreeSet<String>(); 
        ts.add("1we");
        ts.add("6eue");
        ts.add("3fwf");
        ts.add("5ers");
        ts.add("wdd");
        
        for (Iterator it = ts.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
        
        User user = new User("2112","12",20);
        TreeSet<User> ts1 = new TreeSet<User>();
        ts1.add(user);
//        Set<User> ts1 = new HashSet<User>();
        ts1.add(user);        
        ts1.add(user);
        ts1.add(user);
        for (Iterator it = ts1.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
        
        //
        System.out.println("123");
        
        
        
        
        
        
        
        
        
        
        
	}

}
