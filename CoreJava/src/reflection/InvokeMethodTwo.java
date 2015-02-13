package reflection;

import java.lang.reflect.Method;

public class InvokeMethodTwo {

	public static void main(String[] args) throws Exception {
		Class classObj = ReflectionOne.class;

		Method[] methods = classObj.getMethods();
		for (Method method : methods) {
			if (method.getName().equals("callMe")) {
				ReflectionOne one = new ReflectionOne();
				ReflectionOne ref = (ReflectionOne) classObj.newInstance();
//				ref.callMe();
				Method meth = classObj.getMethod("callMe", null);
				meth.invoke(ref, null);
				break;
			}
		}
	}
}
