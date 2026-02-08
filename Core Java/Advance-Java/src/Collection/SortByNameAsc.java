package Collection;

import java.util.Comparator;

public class SortByNameAsc implements Comparator<Emp>{
	public int compare(Emp e1,Emp e2) {
		
		return e1.emp_name.compareTo(e2.emp_name);
	}

}
