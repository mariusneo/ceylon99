package ceylon99;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<? extends Object> items = Arrays.asList(1, 2, 3, 3.0, "a");
		for(Object i : items){
			System.out.println(i);
		}
	}
}