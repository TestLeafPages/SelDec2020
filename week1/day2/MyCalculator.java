package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int add = calc.add(10, 20, 30);
		System.out.println(add);
		
		int sub = calc.sub(50, 10);
		System.out.println(sub);
		
		double mul = calc.mul(25.35, 45.89);
		System.out.println(mul);
	}

}
