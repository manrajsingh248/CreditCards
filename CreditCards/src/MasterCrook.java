
public class MasterCrook extends CreditCard{

	private Money servicefee;
	
	public MasterCrook ( String i, Money s) {
		super(i);
		this.servicefee = s;
	}
	
	public MasterCrook () {
		
		super();
		this.servicefee = new Money("$15.00");
		
	}
	public Money getServiceFee() {
		
		return this.servicefee;
	}
	
	public void chargeCard(Money payamt)
	{
		Money newbalance = getBalance().addMoney(payamt).addMoney(servicefee);
		super.setBalance(newbalance);
		
	}
		
	public String toString() {
		
		return super.toString() + "Card: Master Crook" + 
		"\nService Fee: " + this.servicefee + "\nBalance: " + 
		this.getBalance();
	
	}

}
