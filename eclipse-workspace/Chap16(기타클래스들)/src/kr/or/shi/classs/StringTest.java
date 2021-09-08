package kr.or.shi.classs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//		2.Class 클래스 가져오기
//		 1) String s = new String();
//		    Class c = s.getClass();
//		    
//		 2) Class c = String.class;
//		 3) Class c = Class.forName("java.lang.String");      //동적 로딩
public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");
		Constructor[] constructors = c.getConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		Method[] methods = c.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
 
	}

}
