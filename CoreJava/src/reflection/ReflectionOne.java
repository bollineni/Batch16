package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionOne {
	public String name;
	public String place;
	
	public void callMe(){
		System.out.println("This is ReflectionOne:CallMe method...");
	}
	public static void main(String[] args) {
		Class classObj = "Hello".getClass();
		System.out.println(classObj);
		System.out.println(classObj.getName());
		
		classObj = String.class;
		
		String str = new String("Hello");
		
		try{
			classObj = Class.forName("java.lang.String");
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		System.out.println(classObj);
		
		Class superClassObj = classObj.getSuperclass();
		System.out.println("SuperClass " + superClassObj);
		
		classObj = ReflectionOne.class;
		
		System.out.println("=============Fields==========");
		Field [] fields = classObj.getFields();
		for(int i=0 ; i < fields.length ; i++) {
			System.out.println(fields[i]);
		}
		
		System.out.println("=============Methods==========");
		Method[] methods = classObj.getMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("=============Interfaces==========");
		classObj = String.class;
		Class[] interfaces = classObj.getInterfaces();
		for(int i=0 ; i < interfaces.length; i++) {
			System.out.println(interfaces[i]);
		}
	}

}
