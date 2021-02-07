package org.test;

import java.awt.List;
import java.util.ArrayList;

public class Ascending {
public static void main(String[] args) {
	int a[]= {0,20,5,10};
	int b[]= {0, 40, 0, 50};
	java.util.List<Integer> l =new ArrayList<Integer> ();
	for (int i = 0; i < a.length; i++) {
		l.add(a[i]);
	}
	for (int j = 0; j < b.length; j++) {
		l.add(b[j]);
		
	}
		int [] arr=new int [l.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=l.get(i);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int val=arr[i];
					arr[i]=arr[j];
					arr[j]=val;
				}
				
					
				System.out.println(arr[i]);	
					
				
			}
			
		}
		
	}
	
	
}


	
