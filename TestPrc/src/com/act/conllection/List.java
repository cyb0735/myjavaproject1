package com.act.conllection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class List {
	Random random = new Random();
	public ArrayList<Integer> getlist(){
		ArrayList<Integer> list =new ArrayList<Integer>();
		
		for(int i=0; i<10; i++){
			int num =random.nextInt(10);
			System.out.println(num);
			list.add(num);
		}
		Iterator<Integer> integer = list.iterator();
		System.out.println("=========================");
		while(integer.hasNext()){
			System.out.println(integer.next());
		}
		
		return list;
	}
}
