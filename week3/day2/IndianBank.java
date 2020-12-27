package week3.day2;

public class IndianBank extends FinanceMinistry {

	public void minimumBalance() {
		System.out.println("2000");
		
	}
	
	public void maximumLoanAmount() {
		System.out.println("250000");
	}
	
	
	
	public static void main(String[] args) {
		IndianBank ib = new IndianBank();
		
		ib.maximumLoanAmount();
		ib.minimumBalance();
	}

}
