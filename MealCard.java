
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
	public void setBalance(int initialP) {
		if(initialP != 100) {
			balance = initialP;
			System.out.println("Your initial balance is " + initialP);
		}
		
	}
	
	//2. add points to balance
	public void addPoint(int p) {
		balance += p;
		System.out.println("You've added " + p + " points.");
	}
	
	//3. buyFood
	public void buyFood(int foodPoint) {
		balance -= foodPoint;
		System.out.println("You've used " + foodPoint + " points.");
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
