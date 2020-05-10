
public class IntersectionArray {

	//assuming arrays are sorted else use Arrays.sort()
	public static void main(String[] args) {
		int[] array1= new int[] {1,2,4,6,8};
		int[] array2= new int[] {3,4,5,8,10};
		
		getInterSection(array1,array2);
 
	}

	private static void getInterSection(int[] array1, int[] array2) {
		int size1=array1.length;
		int size2= array2.length;
		int i,j;
		i=j=0;
		
		//check the elements upto when one pointer moves to end
		while(i<size1 && j<size2) {
			if(array1[i]<array2[j])
				i++;
			else if(array1[i]>array2[j])
				j++;
			else {
				System.out.print(array1[i++]);j++;
			}
		}
	}
}
