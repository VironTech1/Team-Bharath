package feb;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;
import java.util.Map.Entry;
	public class MapEx2 {
	    public static void main(String[] args) {
	        Map<String, Integer> g = new HashMap<>();

	        // Add some students and their grades to the map
	        g.put("Allu", 90);
	        g.put("Jashu", 85);
	        g.put("Kavitha", 95);
	        g.put("Swapna", 98);
	        g.put("Sairam", 92);

	        System.out.println( g);
	        Set<String> s = g.keySet();
	        System.out.println("Student Names: " + s);
	        System.out.println("Grades: " + g.values());
	        String studentName = "Allu";
	        System.out.println(studentName + "'s Grade: " + g.get(studentName));
	        Set<Entry<String, Integer>> entrySet = g.entrySet();
	    	for (Entry<String, Integer> pair : entrySet) {
	            System.out.println("s: " + pair.getKey() + ", g: " + pair.getValue());
	    }
	}

}
