import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		System.out.println(myList);
		for (String string : myList) {
			if("2".equals(string))
				myList.remove(string);
		}
		System.out.println(myList);
		/*Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				it.remove();
				//myList.remove(value);//Gives concurrent modification exception
		}
		System.out.println(myList);*/
	}
}
