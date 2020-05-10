
public class UnionArray {

	//assuming arrays are sorted else use Arrays.sort()
	public static void main(String[] args) {
		int[] array1= new int[] {1,2,4,6,8};
		int[] array2= new int[] {3,7,8,10};
		
		getUnion(array1,array2);
 
	}

	private static void getUnion(int[] array1, int[] array2) {
		int size1=array1.length;
		int size2= array2.length;
		int i,j;
		i=j=0;
		
		//check the elements upto when one pointer moves to end
		while(i<size1 && j<size2) {
			if(array1[i]<array2[j])
				System.out.print(array1[i++]);
			else if(array1[i]>array2[j])
				System.out.print(array2[j++]);
			else {
				System.out.print(array1[i++]);j++;
			}
		}
		//print the remaining elements in the array
		while(i<size1)
			System.out.print(array1[i++]);
		while(j<size2)
			System.out.print(array2[j++]);
	}

}
