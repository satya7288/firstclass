import java.util.*;
public class Hash_set {
public static void main(String args[]) {
	ArrayList<Integer>list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(3);
	ArrayList<Integer>list1=new ArrayList<>();
	for(Integer num:list)
	{
		if(!list1.contains(num))
		{
			list1.add(num);
		}
	}
	System.out.println(list1);
}
}