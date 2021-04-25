import java.util.*;

public class arrayList{
	public static void main(String args[]){
		ArrayList list = new ArrayList();
		list.add("20");
		list.add("30");
		list.add("40");
		System.out.print(list.size());
		System.out.print("While Loop");
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next());
		}
		
		System.out.print("Advanced for loop");
		for(Object obj : list){
			System.out.print(obj);
		}
		
		System.out.print("For loop");
			for(int i = 0; i>=0; i++){
				System.out.print(list.get(i));
			}
		
	}
}