package Collection;

import java.util.LinkedHashSet;

public class Q5LinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet l=new LinkedHashSet();
	l.add("Prince");
	l.add(23);
	l.add(23);
	l.add(false);
	l.add(4.7);
	l.add(null);
	l.add(false);
	System.out.println(l);
}
}
