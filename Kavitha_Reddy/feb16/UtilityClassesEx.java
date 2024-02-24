package feb;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
public class UtilityClassesEx {

	public static void main(String[] args) {
		List<Integer> List=Arrays.asList(121,256,22323,5656,7878,8989,232);
		System.out.println(List);
		Collections.reverse(List);
		System.out.println(List);
		Collections.sort(List);
		System.out.println(List);
		Collections.shuffle(List);	
	    System.out.println(List);
	    Collections.shuffle(List);	
	    System.out.println(List);
	    
	    Random random = new Random();
    	System.out.println(random.nextInt());
    	StringTokenizer stk = new StringTokenizer("Hello World","o",true);
    	while(stk.hasMoreTokens()) {
    		String token=stk.nextToken();
    		System.out.println(token);
    	}
    	
    	
    	
	
	}

}
