//U10116048 ������ HW814.4 TestProgram
public class Test144 {

	public static void main(String[] args) {
	/*�ܼ�*/
		double a=0;
		double b=0;
		double c=0;
		int input=-5;//�]�w�@�Ӥp��0����
	/*����*/
		System.out.println("�o�O14.4��TestProgram");
		System.out.println("�ت��b���ըҥ~�B�z");
	/*�B�z*/
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
