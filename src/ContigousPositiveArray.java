
public class ContigousPositiveArray {

	public static void main(String[] args) {

		int a[] =new int[] {-2,4,-3,1,5};
		System.out.println(findMax(a,a.length));
	}

	/**
	 * Kanden Algo
	 * @param a
	 * @param length
	 * @return
	 */
	private static int findMax(int[] a, int length) {

		int totalSum=0;
		int subArraySum=0;
		for(int i=0;i<length;i++) {
			subArraySum=a[i]+subArraySum;
			if(subArraySum<0)
				subArraySum=0;
			if(totalSum<subArraySum)
				totalSum=subArraySum;
			
		}
		
		return totalSum;
	}

}
