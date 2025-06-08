import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class collections2 {

	public static <value, key> void main(String[] args) throws IOException, ClassNotFoundException {
		//Set classes
		//we talking about HashSet
		//creating object to HashSet to perform Operations
		/*Set<Integer> hs=new HashSet<>();
		hs.add(65);
		hs.add(88);
		hs.add(68);
		hs.add(42);
		hs.add(10);
		hs.add(8);
		hs.add(88);
		hs.add(1);
		hs.add(330);
		System.out.println("Before remove:HashSet Values:"+hs);
		hs.remove(10);
		
		System.out.println("After remove:HashSet Values:"+hs);
		
		List<Integer> li=new ArrayList<>();
		li.add(65);
		li.add(88);
		li.add(68);
		li.add(42);
		li.add(10);
		li.add(8);
		li.add(88);
		li.add(1);
		li.add(330);
		
		System.out.println("List values:"+li);
		
		for(Integer i:li) {
			System.out.println(i);
		}
		
		/*TreeSet<Integer> tr=new TreeSet<>();
		tr.add(65);
		tr.add(88);
		tr.add(68);
		tr.add(42);
		tr.add(10);
		tr.add(8);
		tr.add(88);
		tr.add(1);
		tr.add(330);
		System.out.println("Before remove:TreeSet values:"+tr);
		tr.remove(1);
		
		System.out.println("After remove:TreeSet values:"+tr);
	*/
		Map<Integer, String> mp=new HashMap<>();
		mp.put(1,"Siddik");
		mp.put(2, "mani");
		mp.put(3, "kanthu");
		mp.put(4,"sai");
		mp.put(9, "somu");
		mp.put(11, "siva");
		mp.put(5, "durga");
		mp.put(6, "balu");
		mp.put(7, "salaar");
		
		//System.out.println(mp);
		
		mp.remove(6);
		mp.put(11, "sivayya");
		System.out.println("After:"+mp+"/n");
		//fetching
		for(Entry<Integer, String> e:mp.entrySet()) {
			System.out.println(e.getKey()+""+e.getValue());
			
		}
		try {
			FileOutputStream fi=new FileOutputStream("emp.ser");
			ObjectOutputStream oi=new ObjectOutputStream(fi);
			oi.writeObject(mp);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileInputStream ff=new FileInputStream("emp.ser");
			ObjectInputStream oo=new ObjectInputStream(ff);
			HashMap mp1= (HashMap) oo.readObject();
			System.out.println(mp1);
			
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
