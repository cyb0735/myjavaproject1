package com.ann.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;



public class ParseAnn {
	public static void main(String ags[]){
		try {
			Class c =Class.forName("com.ann.test.Child");
			boolean isExit = c.isAnnotationPresent(Description.class);
			if(isExit){
				Description d = (Description)c.getAnnotation(Description.class);
				System.out.println(d.value());
			}
			Method[] ms = c.getMethods();
			for(Method m:ms){
				boolean isMExist = m.isAnnotationPresent(Description.class);
				if(isMExist){
					Description d =(Description)m.getAnnotation(Description.class);
					System.out.println(d.value());
				}
			}
			//another method
			for(Method m:ms){
				Annotation[] as = m.getAnnotations();
				for(Annotation a:as){
					if(a instanceof Description){
						Description d =(Description)a;
						System.out.println(d.value());
					}
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
