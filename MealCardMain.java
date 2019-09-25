
public class MealCardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MealCard mc1 = new MealCard();
		
		mc1.setBalance(200);
		mc1.showBalance();
		
		mc1.addPoint(25);
		mc1.showBalance();
		
		mc1.buyFood(355);
		mc1.showBalance();
	}

}
