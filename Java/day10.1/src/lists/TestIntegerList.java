package lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestIntegerList {

	public static void main(String[] args) {
		//Creating an empty AL to store integers
		ArrayList<Integer> list = new ArrayList<>();	//size=0, capacity=10
		System.out.println(list);						//[]
		System.out.println("Size: "+list.size());		//0
		int[] ints = {2,8,24,1,9,5,17,2};
		
		//Populating the AL with the above values
		for(int i : ints)
			list.add(i);						//Auto-boxing int->Integer
		System.out.println("List via toString: "+list);
		
		//Check if an element is present in the AL
		System.out.println(list.contains(5)?"Present":"Absent");
		
		//Display first and last occurrence of an element
		System.out.println("First occurrence: "+list.indexOf(2));
		System.out.println("Last occurrence: "+list.lastIndexOf(2));
		
		//Removing an element
		System.out.println("Removed: "+list.remove(2));
		System.out.println("List after removal: "+list);
		
		//List contents using for-each
		for(int i : list)						//Auto unboxing
			System.out.println(i+" ");
		
		//List contents using for-each
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		//Attaching an iterator explicitly to the Al
		Iterator<Integer> itr=list.iterator();
		
		//Sorting the elements
		//API of Collections class
		//public <T extends Comparable<? super T>> void sort(List <T> list)
		System.out.println("List before sorting: "+list);
		Collections.sort(list);
		System.out.println("List before sorting: "+list);
	}

}