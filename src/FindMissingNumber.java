
public class FindMissingNumber {

	public static void main(String[] args) {
		int[]  array= new int[] {3,2,5,7,1,4};
		System.out.println(usingSumMethod(array));
		System.out.println(usingXOR(array));
	}

	private static int usingXOR(int[] array) {
		int size= array.length;
		int inivalue=array[0];
		int xorFromOne=1;
		for(int i=1;i<size;i++)
			inivalue= inivalue^array[i];
		for(int i=2;i<=size+1;i++)
			xorFromOne=xorFromOne^i;
		//System.out.println(inivalue +" "+xorFromOne);
		
		return inivalue^xorFromOne;
	}

	private static int usingSumMethod(int[] array) {
		int size = array.length;
		int sum=(size+1)*(size+2)/2;// we need to calculate sum of one more element which is missing
		for(int i=0;i<size;i++)
			sum-=array[i];
		
		return sum;
	}
}
