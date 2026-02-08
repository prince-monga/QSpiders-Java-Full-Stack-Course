package Exception;

public class Main {

	public static void main(String[] args) throws InvalidPasswordException{  //checked exception
		int pass=4534;
		if(pass==4534) {
			System.out.println("Corrrect password");
		}
		else {
			throw new InvalidPasswordException();
		}
		
		
		int otp=6783;
		if(otp==5672) {
			System.out.println("Vaild OTP and Login successfully!");
		}
		else {
			throw new InvalidOTPException();
		}
	}

}

//
//class extends RuntimeException or Exception
//RuntimeException Unchecked exception
//Exception Checked Exception
//
 
//It is Custom exception
class InvalidPasswordException extends Exception{
	// we can also use Exception -- but it makes checked Exception --And  when  it is use for add throws in method decalation
	//getMessage()  //override -- from RuntimeException,
	
	@Override
	public String getMessage() {
		return "Invalid password";
	}
}

//Custom Exception for invaild otp

class InvalidOTPException extends RuntimeException{ 
	//it unchecked exception -runtime 
	//Override the getMessage() --- because we own  desire message to print
	
	public String getMessage() {
		return "Invalid OTP";
	}
}