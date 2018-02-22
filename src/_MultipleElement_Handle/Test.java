package _MultipleElement_Handle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map1 = new LinkedHashMap<String,String>();
		map1.put("Name", "Bhanu");
		map1.put("Subject", "QTP");
		map1.put("Subject1", "Slenium");
		
		String s = map1.get("Subject");
		System.out.println(s);
		
		Map<String,Integer> map2 = new LinkedHashMap<String,Integer>();
		map2.put("Pen", 2);
		map2.put("Book", 4);
		
		System.out.println(map2.containsKey("Pen"));
		System.out.println(map2.containsKey("Pencil"));		
		System.out.println(map2.containsValue(2));
		
		
		
		Set<String> allKeys = map2.keySet(); //get all the Keys
		
		for (String key : allKeys) {
			Integer v = map2.get(key);
			System.out.println(key+"-"+v);
		}

	}

}
