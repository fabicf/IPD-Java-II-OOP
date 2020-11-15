package assign1_test1;

class Person {
	String firstName;
	String lastName;
	int age;
	
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



public class Assign1 {
	

	public static void main(String[] args) {
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
		

	}

}
