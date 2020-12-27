package week3.day2;

public class SBI implements RBI{
	
	public void ITLoan() {
		System.out.println("200000");

	}

	public void minimumBalance() {
		System.out.println("2000");
		
	}

	public void maximumLoanAmount() {
		System.out.println("2000000");
		
	}
	
	public static void main(String[] args) {
		SBI sbi = new SBI();
		
		sbi.maximumLoanAmount();
		sbi.minimumBalance();
		sbi.ITLoan();
		
	}

}
