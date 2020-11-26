
public class myJava1 {
static int myMethod(int x) {
	
	return x + 5;
}	

static int myMethod1(int x, int y){
	return x + y;
}

//method overloading

static int yourMethod(int x, int y) {
	return x + y;
}

static double yourMethod(double x, double y) {
	return x - y;
}

static String yourMethod(String x, String y) {
	return x + y;
}

//recursion
public static int sum(int k) {
	if (k > 0) {
		return k + sum(k-1);
	}else {
		return 0;
	}
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// methods
		System.out.println(myMethod(5));
		
		System.out.println(myMethod1(5, 3));
		
		int z = myMethod1(4,3);
		System.out.println(z);
		
		//method overloading
		
		System.out.println("method int = " + yourMethod(5, 3));
		System.out.println("method double = " + yourMethod(5.0, 3.0));
		System.out.println("method string = " + yourMethod("5", "3"));
		
		//recursion
		int result = sum(3);
		System.out.println(result);

	}

}
