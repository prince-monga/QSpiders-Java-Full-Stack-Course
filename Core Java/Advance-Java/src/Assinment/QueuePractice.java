package Assinment;

import java.util.Iterator;
import java.util.PriorityQueue;


public class QueuePractice {

	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue();
		q.add(10);
		q.add(20);
		q.add(45);
		q.add(434);
		System.out.println(q);
		//Iterator
		Iterator i=q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(int a:q) {
			System.out.println(a);
		}
		
	}

}
