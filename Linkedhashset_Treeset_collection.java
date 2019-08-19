import java.util.*;
public class Main
{
	public static void main(String[] args) {
	LinkedHashSet <Integer> hk=new LinkedHashSet<Integer>();
	TreeSet <String> tr=new TreeSet<String>();

	hk.add(90);
	hk.add(90);
	tr.add("Zibran");
	hk.add(60);
	tr.add("Tommy");
	hk.add(100);
	Iterator<String> it2=tr.iterator();
	Iterator<Integer> itr=hk.iterator();
	while(itr.hasNext())
	{
	    System.out.println(itr.next());
	}
	while(it2.hasNext())
	{
	    System.out.println(it2.next());
	}
	}
}
