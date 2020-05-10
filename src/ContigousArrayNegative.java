
public class ContigousArrayNegative {

public static void main(String[] args) {
	int[] a= new int[] {-2,4,-3,1,5};//{-1,-4,-2,-5};
	System.out.println(findMax(a,a.length));
}

private static int findMax(int[] a, int length) {

	int subArray=a[0];
	int sumTotal=a[0];
	
	for(int i=0;i<length;i++) {
		subArray=Math.max(a[i], subArray+a[i]);
		sumTotal=Math.max(subArray, sumTotal);
	}
	return sumTotal;
	
}
}
