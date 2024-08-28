package Test;
import java.util.*;
class PriorityQueueDemo{
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		for(int i=0;i<=10;i++) {
			q.offer(i);
		}
		System.out.println("PriorityQueue "+q);
		System.out.println("elements peeking : "+q.peek());
		System.out.println(q);
		System.out.println("elements polling : "+q.poll());
		System.out.println(q);
		}

		
	}
