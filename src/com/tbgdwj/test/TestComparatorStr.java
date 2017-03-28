package com.tbgdwj.test;

import java.util.Comparator;

public class TestComparatorStr implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub	
		int i=0;
		if (o1.length() > o2.length()) {
			i=1;
		}else if (o1.length() < o2.length()){
			i=-1;
		}else if(o1.length() == o2.length()){
			i=o1.compareTo(o2);
		}
				
		return i;
	}

	
	
}
