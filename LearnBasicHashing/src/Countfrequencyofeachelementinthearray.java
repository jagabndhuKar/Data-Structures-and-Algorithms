
public class Countfrequencyofeachelementinthearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,2,3,2,4,5,4};
countfrequencyofeachelementinthearray(arr);
	}
public static void countfrequencyofeachelementinthearray(int []arr) {
	int fre []= new int [100];
	System.err.println(fre.length);
	for(int i:arr) {
		fre[i]+=1;
	}
	
	for(int j:fre) {
		if(fre[j]>0) {
	System.out.println(j+" "+fre[j]);
		}
	}
}
}
