
public class Cheeseburger extends Sandwich {

	private Bread bread;
	private Cheese cheese;
	private Salad salad;

	public Cheeseburger(Bread bread, Cheese cheese, Salad salad) {

		this.bread = bread;
		this.cheese = cheese;
		this.salad = salad;
	}

	public String getCheeseStyle() {
		return cheese.getStyle();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 15;
	}

}
