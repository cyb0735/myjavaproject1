package com.act.conllection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListPrc {
	
	 List list = new List();
	public static void main(String[] args){
		ListPrc listPrc = new ListPrc();
		listPrc.hashmap();
		listPrc.getList();
		listPrc.setlist();
	}
	
	public void hashmap(){
		HashMap<String, Number> params = new HashMap<String, Number>();
		long policyId = 131362;
		params.put("policyId",policyId);
		params.put("policyId2",1212124);
		params.put("policyId3",1212333);
		Object[] paramNames = params.keySet().toArray();
		String[] paramNameStr = new String[params.size()];
		Object[] paramValues = new Object[params.size()];
		for (int i = 0; i < params.size(); i++ ) {
			paramValues[i] = params.get(paramNames[i]);
			System.out.println(paramValues[i]);
			paramNameStr[i] = (String)paramNames[i];
			System.out.println(paramNameStr[i]);
		}
	}
	
	public void getList(){
		ArrayList<Integer> listnum = list.getlist();
		System.out.println("for()=================");
		for(Integer integer:listnum){
			System.out.println(integer);
		}
	}
	
	public void setlist(){
		Set<String> ist = new HashSet<String>();
		ist.add("str1");
		ist.add("str1");
		ist.add("str3");
		ist.add("str4");
		ist.add("str4");
		ist.add("str5");
		ist.add("str6");
		Iterator<String> iterator = ist.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		if(ist.contains("str4")){
			ist.remove("str1");
		}
		System.out.println("contains str1 ? :"+ist.contains("str1"));
		
	}
}
