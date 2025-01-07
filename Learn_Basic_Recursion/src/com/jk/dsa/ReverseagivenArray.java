package com.jk.dsa;

public class ReverseagivenArray {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,5};
		reverseagivenArray2(arr,0,arr.length-1);
	for(int i:arr) {
		System.out.println(i);
	}
	}
public static void reverseagivenArray(int arr[]) {
	int i=0,j=arr.length-1;
	while(i<=j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;j--;
	}
}

public static void reverseagivenArray2(int arr[],int left,int right) {
if(left<=right) {
		int temp =arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		reverseagivenArray2(arr, (left+1), (right-1));
}else {
	return;
}
}

}
