

public class myMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salad mySalad = new Salad("lettuce");
		Cheese myCheese = new Cheese("swiss", 2);
		Bread myBread = new Bread(15, "brioche");
		
		Cheeseburger myX = new Cheeseburger(myBread, myCheese, mySalad);
		Cheeseburger xTudo = new Cheeseburger(myBread, new Cheese("cheddar", 3), new Salad("tomato"));
		
		myX.setName("meuX");
		
		System.out.println(xTudo.getCheeseStyle());
		System.out.println(myX.getName());
		System.out.println("$ " + myX.getPrice());

	}

}
