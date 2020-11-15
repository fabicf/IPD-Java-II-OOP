package assign1_test1;

//Person
class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String nameValue) {
		 firstName = nameValue;
	}
	
	public void setLastName(String nameValue) {
		 lastName = nameValue;
	}
	
	public void setAge(int ageValue) {
		if (ageValue < 0 || ageValue > 100) {
			age = 0;
		} else {
			age = ageValue;
		}
	}
	
	public boolean isTeen() {
		if (age > 12 && age < 20) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String getFullName() {
		if (firstName.isEmpty() && lastName.isEmpty()) {
			return "";
		}else if (lastName.isEmpty()) {
			return firstName;
		}else if (firstName.isEmpty()) {
			return lastName;
		} 	
		
		return firstName + " " + lastName;
	}
	
		
}


//Sum Calculator
class SimpleCalculator{
	double firstNumber;
	double secondNumber;
	
	public double getFirstNumber () {
		return firstNumber;
	}
	
	public double getSecondNumber() {
		return secondNumber;
	}
	
	public void setFirstNumber(double firstValue) {
		firstNumber = firstValue;
	}
	
	public void setSecondNumber(double secondValue) {
		secondNumber = secondValue;
	}
	
	public double getAdditionResult() {
		return firstNumber + secondNumber;
	}
	
	public double getSubstractionResult() {
		return firstNumber - secondNumber;
	}
	
	public double getMultiplicationResult() {
		return firstNumber * secondNumber;
	}
	
	public double getDivisionResult() {
		return firstNumber / secondNumber;
	}
}



public class Assign1 {
	

	public static void main(String[] args) {
		
		//Person
		Person fabi = new Person();
		fabi.setFirstName("");
		fabi.setLastName("");
		fabi.setAge(10);
		System.out.println("fullName = " + fabi.getFullName());
		System.out.println("teen = " + fabi.isTeen());
		fabi.setFirstName("John");
		fabi.setAge(18);
		System.out.println("fullName = " + fabi.getFullName());
		System.out.println("teen = " + fabi.isTeen());
		fabi.setLastName("Smith");
		System.out.println("fullName = " + fabi.getFullName());
		
		//skip line
		System.out.println();
				
		//Sum Calculator
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add = " + calculator.getAdditionResult());
		System.out.println("subtract = " + calculator.getSubstractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setFirstNumber(0);
		System.out.println("multiply = " + calculator.getMultiplicationResult());
		System.out.println("divide = " + calculator.getDivisionResult());
		
	}

}
