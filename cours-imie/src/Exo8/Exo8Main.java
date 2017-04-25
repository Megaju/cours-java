package Exo8;

import java.lang.reflect.Field;

public class Exo8Main {

	public static void main(String[] args) {
		
	}
	
	public <T> boolean testForm(T formToTest) throws IllegalArgumentException, IllegalAccessException {
		
		Class c = formToTest.getClass();
		
		Field[] fields = c.getDeclaredFields();
		
		for (Field f : fields) {
			Nullable nullable = f.getAnnotation(Nullable.class);
			if (nullable != null) {
				f.setAccessible(true);
				Object o = f.get(formToTest);
				if (!nullable.value() && o == null) {
					return false;
				}
			}
		}
		
		return false;
	}

}
