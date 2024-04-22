
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Pruebas1 {

	public Pruebas1() {
	}

	public static void main(String[] args) {
		System.out.println("____________________________Lists________________________________");

		LinkedList<String> l = new LinkedList<String>();
		
		System.out.println(l.size() + " " + l.isEmpty());
		
		l.add("a"); l.add("b"); l.add("c"); l.add("d"); l.add("e"); l.add("f");
		
		System.out.println(l);
		
		System.out.println(l.set(1, "x"));
		

		System.out.println(l);
		
		l.add(2, "a");
	    System.out.println(l);
	    
	    System.out.println(l.pollFirst() + " " + l.peekFirst());
	    
	    System.out.println(l.get(4));
	    
	    l.remove("a");
	    
	    System.out.println(l);
	    
	    System.out.println("-------------------------------------");
	    for (String s : l) {
	         System.out.print(s+".");
	      }
	    System.out.println();
	    System.out.println(l.contains("xxx"));

	    System.out.println("____________________________Sets________________________________");

	    LinkedHashSet<String> s = new LinkedHashSet<String>();
	    System.out.println(s.size() + " " + s.isEmpty());
	      System.out.print(s.add("value1"));
	      System.out.print(s.add("value2"));
	      System.out.print(s.add("value3"));
	      System.out.print(s.add("value1")); // como ya existe no lo inserta devuelve false
	      System.out.println(s);
	    
	      System.out.println(s.contains("value3") + " " + s.contains("value9"));
	      System.out.println(s.remove("value2") + " " + s.remove("value2"));
	      
	      System.out.println(s.size() + " " + s.isEmpty());
	      for (String v : s) {
	         System.out.print(v);
	      }
	      
	      System.out.println("____________________________MAPs________________________________");

	      LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
	      System.out.println(m.size() + " " + m.isEmpty());
	      System.out.print(m.put("key1", "value1"));
	      System.out.print(m.put("key2", "value2"));
	      System.out.print(m.put("key3", "value3"));
	      System.out.print(m.put("key3", "value1"));
	      System.out.println();
	      System.out.println(m);
	      System.out.println(m.containsKey("key2") + " " + m.containsValue("key2"));
	      System.out.println(m.containsKey("value1") + " " + m.containsValue("value1"));
	      System.out.println(m.get("key2") + " " + m.get("key9"));
	      System.out.println(m.remove("key1") + " " + m.remove("key1"));
	      System.out.println(m);
	      System.out.println(m.size() + " " + m.isEmpty());
	      for (String k : m.keySet()) {
	         System.out.print(k);
	      }
	      System.out.println();
	      for (String v : m.values()) {
	         System.out.print(v);
	      }
	      System.out.println();
	      for (java.util.Map.Entry<String, String> e : m.entrySet()) {
	         System.out.print("[" + e.getKey() + " " + e.getValue() + "]");
	      }
	}

}
