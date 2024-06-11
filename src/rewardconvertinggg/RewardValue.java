package rewardconvertingg;

public class RewardValue {

	private double cashValue;
	private double milesValue;
//	private double rate;// 0.0035
//	
	
	
	RewardValue(double cashValue){
		this.cashValue = cashValue;
	}
	
//	public  RewardValue(cashValue) {
//		
//	}
	
	public double getMilesValue() {
		return cashValue/0.0035;// cash/rate
	}
	public double getCashValue() {
		return cashValue; // mile*rate
	}
	public void setCashValue(double cash) {
		this.cashValue = cash;
	}
	}
