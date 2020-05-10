import static  java.lang.Integer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
//import static java.lang.Long.*;

class parent {
	
	public static void method() {
		System.out.println("Parent method");
	}

	
	
}

public class Inhertance extends parent{


	public static void method(String list) {
		//list.add("test");
		//list.add("sample");
		list=list+"222";
		System.out.println("Size of list "+list);
		System.out.println("child method");
	}
	
	
	public static void main(String[] args) {
		AtomicBoolean atomic= new AtomicBoolean(true);
		//List<String> list =new ArrayList<>();
		String list="abc";
		System.out.println(list);
		method(list);
		System.out.println("After methhod size is"+list);
		
		if(atomic.get()) {
			System.out.println("Current value is true");
		}
		
		atomic.compareAndSet(false, true);
		
		System.out.println(atomic);
		
		System.out.println(MAX_VALUE);
		parent p= new parent();
		p.method();
		parent p1= new Inhertance();
		p1.method();
		Inhertance i= new Inhertance();
		i.method();
//		Inhertance i1= (Inhertance) new parent(); //Runtime error ClasscastException
//		i1.method();
		}
	
}
