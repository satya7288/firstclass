import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//for reading/fetcing/retriving
class input{
	void m1() throws IOException, ClassNotFoundException {
		//fetching
		//calling my stu.ser file
		FileInputStream fi=new FileInputStream("stu.ser");
		//getting our object
		ObjectInputStream oi=new ObjectInputStream(fi);
		//reading the object with readObject method
		//Assigning out object to another HashMap obejct
		//here we use type casting because here we get object
		//this obejct data we have to convert into our hashmap data
		HashMap<Integer,String> mp1=(HashMap<Integer, String>) oi.readObject();
		System.out.println(mp1);
		
		for(Entry<Integer, String> name: mp1.entrySet()) {
			System.out.println(name.getKey()+" "+name.getValue());
		}
	}
}

public class iodemo {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Map<Integer, String> mp=new HashMap<>();
		mp.put(1, "sathish");
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
		try {
			//For Stroing the data
			
			//creating file with fileoutputstream
		FileOutputStream fo=new FileOutputStream("stu.ser");
		//add out file object into obejctoutputStream
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		//then write our Hashmap obejct into object–outputStream
		oo.writeObject(mp);
		System.out.println("Data Added successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		input i=new input();
		i.m1();
	}
}
