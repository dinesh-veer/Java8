import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private int id ;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	
}

public class Test {
	public static void main(String[] args) {
		int A[]= {3,1,4,100,2,7,-77,-99};

		Employee e= new Employee();
		e.setName("DInesh");
		e.setId(1);
		
		HashMap<Employee,Integer> map= new HashMap<>();
		map.put(e, 2);//overrideen hashcode method
		System.out.println(map.get(e));
		e.setId(3);
		System.out.println(map.get(e));
		
		List<Integer> list= new ArrayList<Integer>(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}));
		for(int i=0;i<list.size();i++)
			list.remove(i);
		System.out.println(list);
		
		final int value;
		value=100;
		System.out.println(value);
		
		
		//System.out.println(collect(A));
	}

	private static int collect(int[] a) {

		//Arrays.sort(a);
		List<Integer> list=Arrays.stream(a).boxed().filter(s->s>0).sorted().collect(Collectors.toList());
		System.out.println(list);
		for(int i=1;i<list.get(list.size()-1);i++) {
			if(list.contains(i))
				continue;
			else {
				//System.out.println(i);
				//break;
				return i;
			}
		}
		return 0;
	}

}
