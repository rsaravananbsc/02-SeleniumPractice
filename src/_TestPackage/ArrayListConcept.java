package _TestPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("QSP");
		a.add("JSP");
		a.add("QSP");
		
		Collections.sort(a);
		
		for (String string : a) {
			System.out.println(string);
		}
			
		System.out.println("--------------------------");
		
		TreeSet<String> t = new TreeSet<String>();
		t.add("QSP");
		t.add("JSP");
		t.add("RSP");
		
		for (String string : t) {
			System.out.println(string);
		}
		
		

	}

}
