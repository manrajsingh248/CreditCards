
public class DishonestExpress extends CreditCard{
	
	private int interestlevel;
	
	public DishonestExpress( String i, int l) {
	
		super(i);
		this.interestlevel = l;	
		
	}
	public DishonestExpress() {
		
		super();
		this.interestlevel = 8;
	}
	public int getInterestLevel() { 
			
		return this.interestlevel;
	}
		
	public void chargeCard(Money payamt) {
		
		Money newbalance2 = getBalance().addMoney(payamt).multiplyMoney(interestlevel).addMoney(payamt);
		super.setBalance(newbalance2);
		
	}
		
	public String toString() {
		
		return super.toString() + "Card: Dishonest Express" + 
		"\nInterest Level: " + this.interestlevel + "\nBalance: " + 
		this.getBalance();
	
	}
}
