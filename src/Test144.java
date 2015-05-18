//U10116048 楊明璋 HW8_14_4 TestProgram
import java.util.Scanner;
public class Test144 {

	public static void main(String[] args) {
	/*變數*/
		double a=0;
		double b=0;
		double c=0;
		int input1=0;//設定一個值
		double input2=0;
		int input3=0;
	/*物件*/
		Loan lo =new Loan();
	/*提示*/
		System.out.println("這是14.4的TestProgram");
		System.out.println("目的在測試:輸入值小於等於0的例外處理");
	/*Scanner*/
		Scanner sc =new Scanner(System.in);
	/*處理*/	
		//第1個輸入
		try{
			System.out.print("請輸入LoanAmount:-->");
			input1=sc.nextInt();
			lo.setLoanAmount(input1);
		}
		catch(inputException e){
			System.out.println("輸入值不可為負或0-->將自動指定為預設值");
		}
		
		
		//第2個輸入
		try{		
			System.out.print("請輸入AnnualInterestRate-->");
			input2=sc.nextDouble();
			lo.setAnnualInterestRate(input2);
		}
		catch(inputException e){
			
			System.out.println("輸入值不可為負或0-->將自動指定為預設值");
		}
		
		//第3個輸入
		try{
			System.out.print("請輸入NumberOfYears-->");
			input3=sc.nextInt();
			lo.setNumberOfYears(input3);
		}
		catch(inputException e){
			System.out.println("輸入值不可為負或0-->將自動指定為預設值");
		}
		
		
	/*display*/
		System.out.println("----------輸出-------------");
		a=lo.getLoanAmount();
		b=lo.getAnnualInterestRate();
		c=lo.getNumberOfYears();
		System.out.println("LoanAmount:"+a+",AnnualInterestRate:"+b+",NumberOfYears:"+c);
	}

}
