//U10116048 楊明璋 HW814.4 TestProgram
public class Test144 {

	public static void main(String[] args) {
	/*變數*/
		double a=0;
		double b=0;
		double c=0;
		int input=-5;//設定一個小於0的值
	/*提示*/
		System.out.println("這是14.4的TestProgram");
		System.out.println("目的在測試例外處理");
	/*處理*/
		Loan lo =new Loan();
		lo.setLoanAmount(input);
		lo.setAnnualInterestRate(input);
		lo.setLoanAmount(input);
	/*display*/
		a=lo.getLoanAmount();
		b=lo.getAnnualInterestRate();
		c=lo.getLoanAmount();
		System.out.println(a+" "+" "+b+" "+c);
	}

}
