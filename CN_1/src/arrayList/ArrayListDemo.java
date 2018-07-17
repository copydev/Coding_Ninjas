package arrayList;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println(list1.size());
		list1.add(1);
		list1.add(20);
		list1.add(24);
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		list1.add(2,50);
		System.out.println(list1.get(2));
		for(int i=0;i<list1.size();i++){
			System.out.print(list1.get(i)+" ");
		}
		System.out.println("");
		//list1.remove(1);
		list1.set(1, 100);
		for(int i=0;i<list1.size();i++){
			System.out.print(list1.get(i)+" ");
		}
	}

}
