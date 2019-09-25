
public class MealCard {

	//fields
	private int point;
	private int balance; //balance is based on point +-
	private int foodItemPoint;
	
	
	//constructor: default value is 100
	public MealCard() {
		point = 100;
		balance = point;
	}
	
	//methods:
	
	//1. setBalance
	public void setBalance(int point) {
		if(point != 100) {
			balance = point;
		}
	}
	
	//2. add points to balance
	public void addPoint(int p) {
		balance += p;
	}
	
	//3. buyFood
	public void buyFood(int foodItemPoint) {
		balance -= foodItemPoint;
	}
	
	//4. decline if balance is negative, else show the current balance
	public void showBalance() {
		if(balance < 0) {
		System.out.println("Your current balance is " + (balance - foodItemPoint));
		System.out.println("It is below zero. Sorry it's declined. Please add more points!");
		}else {
			System.out.println("Your current balance is " + balance);
		}
	}
	
	
	
	
}
