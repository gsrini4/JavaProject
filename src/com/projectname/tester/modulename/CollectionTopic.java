package com.projectname.tester.modulename;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionTopic {

	public static void main(String[] args) {

		Map<Integer, Object> map = new LinkedHashMap<Integer, Object>();
		
		map.put(1, "Java");
		map.put(2,'S');
		map.put(3, 10.098f);
		map.put(4, true);
		map.put(5, 12345);
		map.put(6, null);
		map.put(6, "Helloooooo");
		map.put(null, null);
		map.put(null, "Python");
		map.put(8, 12345);
		
		System.out.println(map);
		
		Set<Entry<Integer, Object>> entrySet = map.entrySet();
		
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
		}
		
		System.out.println(map.containsKey(6));
		
		System.out.println(map.containsValue("Python"));
		
		System.out.println(map.equals(map));
		
		System.out.println(map.get(null));
		
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = map.values();
		System.out.println(values);
		
		map.remove(8, 12345);
		System.out.println(map);
		
		System.out.println(map.size());
		
		map.replace(null, "selenium");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		
		
		
		
		
		
		
		
		
	}
}
