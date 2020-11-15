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

//Wall Area
class Wall{
	double width;
	double height;
	
	public Wall() {
		
	}
	
	public Wall(double consWidth, double consHeight) {
		height = consHeight;
		
		if (consWidth < 0) {
			width = 0;
		} else {
			width = consWidth;
		}
		
		if (consHeight < 0) {
			height = 0;
		} else {
			height = consHeight;
		}	
	}
	
	public double getWith() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double widthValue) {
		if (widthValue < 0) {
			width = 0;
		}else {
		width = widthValue;
		}
	}
	
	public void setHeight(double heightValue) {
		if (heightValue < 0) {
			height = 0;
		} else{
			height = heightValue;
		}	
	}
	
	public double getArea() {
		return width * height;
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
		
		//skip line
		System.out.println();
		
		//Wall 
		Wall wall = new Wall (5, 4);
		System.out.println("area = " + wall.getArea());
		
		wall.setHeight(-1.5);
		System.out.println("width = " + wall.getWith());
		System.out.println("height = " + wall.getHeight());
		System.out.println("area = " + wall.getArea());
		
		
		
	}

}
