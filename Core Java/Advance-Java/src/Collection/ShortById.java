package Collection;

public class ShortById {
	@Override
    public int compare(Emp e1, Emp e2) {
        return e1.emp_id.compareTo(e2.emp_id); // DESC order
    }  
}
