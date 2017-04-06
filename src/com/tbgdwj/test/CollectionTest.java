package com.tbgdwj.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
       
       //
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
        User user1 = new User("2112","12",20);
        TreeSet<User> ts1 = new TreeSet<User>();
        ts1.add(user);
//        Set<User> ts1 = new HashSet<User>();
        ts1.add(user);        
        ts1.add(user);
        ts1.add(user1);
        ts1.add(user1);
        ts1.add(user1);
        for (Iterator it = ts1.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
        
		//字符排序
        Set<String> strSet1 = new TreeSet<String>(new TestComparatorStr());//长度          
        Set<String> strSet = new TreeSet<String>();//自然顺序
//        strSet.add("dfdffd");
//        strSet.add("feed");
//        strSet.add("ewd");
//        strSet.add("cdee");
//        
//        for(String str:strSet){
//        	System.out.println(str);
//        }
        strSet1.add("dfdffd");
        strSet1.add("feed");
        strSet1.add("ewd");
        strSet1.add("cdee");
        for(String str:strSet1){
        	System.out.println(str);
        }        
        
        Map<String,String> map = new HashMap<String,String>();
        
        System.out.println(map.put("1", "twx"));
        System.out.println(map.put("1", "twx1"));
        map.put("2", "twx1");
        map.put("3", "twx2");
        System.out.println(map);
        
        Map<String,String> map1 = new TreeMap<String,String>();
        map1.put("1", "twx1");
        map1.put("2", "twx2");
        map1.put("3", "twx1");
        map1.put("4", "twx2");
        System.out.println(map1);
        
        System.out.println(map1.get("1"));
        Set<String> kset =map1.keySet();
        for(String str:kset){
           	String value=map1.get(str);
           	System.out.println(str+":"+value);        	
        }

        //System
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.library.path"));
        System.out.println(System.nanoTime());
        //Runtime
        
        //Math
     
        
        
	}



}
