import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Findthehighestlowestfrequencyelement {

	public static void main(String[] args) {
	int	arr []= {1,22,2,2,2,2,1,1,3,2,1,3,5,4,4,2};
		findthehighestlowestfrequencyelement(arr);
	}

	public static void findthehighestlowestfrequencyelement(int arr[]) {
		Map<Integer, Integer > map = new HashMap<Integer, Integer>();
		
		for(int i : arr ) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);	
			}
		}

		int max = Integer.MIN_VALUE,maxv =0 , min = Integer.MAX_VALUE, minv=0;
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			if(max<ent.getValue()) {
				max = ent.getValue();
				maxv=ent.getKey();
			}
			
			if(min>ent.getValue()) {
				min = ent.getValue();
				minv=ent.getKey();
			}
		}
		
		System.out.println("Max fre "+maxv+" Lest fre "+minv);
	}
}
