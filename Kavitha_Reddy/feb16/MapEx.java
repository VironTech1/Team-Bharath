package feb;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
public class MapEx {
	public static void main(String[] args) {
	Map<Integer,String>m = new HashMap<>();
	m.put(1,"one");
	m.put(2,"Two");
	m.put(3,"Three");
	m.put(4,"Four");
	m.put(5,"Five");
	m.put(6,"Six");
	m.put(3, "Test");
	System.out.println(m);
	System.out.println(m.keySet());
	System.out.println(m.values());
	System.out.println(m.get(5));
	Set<Entry<Integer,String>> entrySet = m.entrySet();
	for (Entry<Integer, String> pair : entrySet) {
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
	}
	}
}
