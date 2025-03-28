package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("soham", 1);
		map.put("patil", 2);
		map.put("sohampatil", 3);
		map.put("sohamsoham", 4);
//		System.out.println(map.keySet());
//		System.out.println(map.entrySet());
//		System.out.println(map.values());
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) iterator
					.next();
			System.out.println(entry.getValue() + " " + entry.getKey());

		}

		Properties properties = new Properties();
		properties.put("India", "delhi");
		Set properties2 = properties.entrySet(); 
		Iterator iterator2 = properties2.iterator();
		while (iterator2.hasNext()) {
			Object object = (Object) iterator2.next();
			System.out.println(object);
			
		}

	}

}
