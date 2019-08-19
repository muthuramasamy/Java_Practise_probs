import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    PriorityQueue<String> pq=new PriorityQueue<String>();
	    pq.add("Muthu");
	    pq.add("Tommy");
	    pq.add("sathish");
	    pq.add("Manoj");
	    pq.add("Kingmaker");
	    System.out.println("head:"+pq.element());
	    System.out.println("head:"+pq.peek());
	    Iterator it=pq.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
		pq.poll();
		
		System.out.println("After removing elements:");
		Iterator<String> it2=pq.iterator();
		while(it2.hasNext())
		{
		    System.out.println(it2.next());
		}
	}
}
