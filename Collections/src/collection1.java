import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//T for type
//E for Element
//k,v for Key and values
class box<T>{
	private int item;

	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
}

public class collection1 {
	public static void main(String[] args) {
		//ArrayList
		//class_name obj_name=new class_name
		ArrayList Ar=new ArrayList();
		//to add values
		Ar.add("aits");
		Ar.add(4);
		Ar.add(4.5);
		Ar.add(58.65588);
		Ar.add(4);
		//System.out.println(Ar);
		//to remove
		Ar.remove(3);
	//	System.out.println(Ar);
		//to update
		Ar.add(3, "element");
		//System.out.println(Ar);
		//to find the size
		//System.out.println(Ar.size());
		Ar.remove(1);
		System.out.println(Ar);
		for(Object name:Ar) {
			System.out.println(name);
		}
		System.out.println("=======================");
		Iterator it= Ar.iterator();
		for(;it.hasNext();) {//it checks the true or false
			System.out.println(it.next());
		}
		
		//LinkedList
		LinkedList<String> ll=new LinkedList<>();
		ll.add("2");
		ll.add("6");
		ll.add("raju");
		ll.add("ravi");
		ll.add("sai");
		
		ll.add("aits");
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		
		box<Integer> bb=new box<>();
		bb.setItem(5);
		System.out.println(bb.getItem());
		box<String> b1=new box<>();
		
	
	}
}
