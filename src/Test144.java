//U10116048 ������ HW8_14_4 TestProgram
import java.util.Scanner;
public class Test144 {

	public static void main(String[] args) {
	/*�ܼ�*/
		double a=0;
		double b=0;
		double c=0;
		int input1=0;//�]�w�@�ӭ�
		double input2=0;
		int input3=0;
	/*����*/
		Loan lo =new Loan();
	/*����*/
		System.out.println("�o�O14.4��TestProgram");
		System.out.println("�ت��b����:��J�Ȥp�󵥩�0���ҥ~�B�z");
	/*Scanner*/
		Scanner sc =new Scanner(System.in);
	/*�B�z*/	
		//��1�ӿ�J
		try{
			System.out.print("�п�JLoanAmount:-->");
			input1=sc.nextInt();
			lo.setLoanAmount(input1);
		}
		catch(inputException e){
			System.out.println("��J�Ȥ��i���t��0-->�N�۰ʫ��w���w�]��");
		}
		
		
		//��2�ӿ�J
		try{		
			System.out.print("�п�JAnnualInterestRate-->");
			input2=sc.nextDouble();
			lo.setAnnualInterestRate(input2);
		}
		catch(inputException e){
			
			System.out.println("��J�Ȥ��i���t��0-->�N�۰ʫ��w���w�]��");
		}
		
		//��3�ӿ�J
		try{
			System.out.print("�п�JNumberOfYears-->");
			input3=sc.nextInt();
			lo.setNumberOfYears(input3);
		}
		catch(inputException e){
			System.out.println("��J�Ȥ��i���t��0-->�N�۰ʫ��w���w�]��");
		}
		
		
	/*display*/
		System.out.println("----------��X-------------");
		a=lo.getLoanAmount();
		b=lo.getAnnualInterestRate();
		c=lo.getNumberOfYears();
		System.out.println("LoanAmount:"+a+",AnnualInterestRate:"+b+",NumberOfYears:"+c);
	}

}
