package Day3;

public class ElectricityBillUsingFunction {
    public static double electricityBill(int unit) {
        double total_amount = 0;
        if (unit > 0 && unit <= 100) {
            total_amount = unit * 2;
        } else if (unit > 100 && unit <= 300) {
            total_amount = unit * 4;
        } else {
            total_amount = unit * 6;
        }
        if (total_amount > 2000) {
            total_amount = total_amount +
                    (total_amount * 0.1);
            return total_amount;
        } else {
            return total_amount;
        }
    }
    public static void main(String[] args) {
        System.out.println("Total bill:" + electricityBill(90));
        System.out.println("Total bill:" + electricityBill(150));
        System.out.println("Total bill:" + electricityBill(500));
    }
}
