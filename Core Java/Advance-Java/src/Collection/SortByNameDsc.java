package Collection;

import java.util.Comparator;

public class SortByNameDsc implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        return e2.emp_name.compareTo(e1.emp_name); // DESC order
    }
}
