import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Countfrequencyofeachelementinthearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 3, 2, 4, 5, 4 };
		countfrequencyofeachelementinthearray(arr);
		countfrequencyofeachelementinthearrayUsingMap(arr);
	}

	public static void countfrequencyofeachelementinthearray(int[] arr) {
		int fre[] = new int[10];
		for (int i : arr) {
			fre[i] += 1;
		}

		for (int j : fre) {
			System.out.print(j);
		}
	}

	public static void countfrequencyofeachelementinthearrayUsingMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr) {
			if(map.containsKey(i)) {map.put(i, map.get(i)+1);} else {map.put(i, 1);}
			}
		map.forEach((key,value) -> System.out.println(key +" ->" + value));
	}
}
