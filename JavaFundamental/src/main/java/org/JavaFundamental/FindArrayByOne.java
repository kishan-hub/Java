package org.JavaFundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindArrayByOne {
  
	//Arrays.asList(2,6,8,12,15,19,22,98,22,45)
	
	public static void main(String[] args) {
		boolean flag=false;
		String value=null;
		int temp=0;
		int i=0;
		int d;
		List<Integer> list =Arrays.asList(2,6,8,12,15,19,22,98,22,45);
		
        List<Integer> newList=new ArrayList<>();
		for(int i1:list) {
			
			temp=i;
			
			while(temp!=0) {
			d=temp%10;
			 
			temp=temp/10;
			if(temp ==1) {
				newList.add(i);
			}
			}
		}
		
		System.out.println(newList);
		
	}
	
}
