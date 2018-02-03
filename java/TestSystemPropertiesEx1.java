package tw.leonchen.myproject.oop.collections.generic;

import java.util.Enumeration;
import java.util.Properties;

public class TestSystemPropertiesEx1 {

	public static void main(String[] args) {
		Properties p1 = System.getProperties();
		Enumeration<?> e1 = p1.propertyNames();
		
		while(e1.hasMoreElements()) {
			String key = (String)e1.nextElement();
			String value = p1.getProperty(key);
			
			System.out.println(key + ":" + value);
		}

	}

}
