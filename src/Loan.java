//U10116048 ������ HW8_14_4 �ק諸LOAN CLASS
public class Loan {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;
  
  /** Default constructor */
  public Loan() {
    this(2.5, 1, 1000);
  }

  /** Construct a loan with specified annual interest rate,
      number of years and loan amount 
    */
  public Loan(double annualInterestRate, int numberOfYears,
      double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /** Set a new annualInterestRate �[�J��X�ҥ~�\�� */
  public void setAnnualInterestRate(double annualInterestRate)throws inputException {
    //����
	  if(annualInterestRate<=0){
		  throw new inputException();
	  }else{
		  this.annualInterestRate = annualInterestRate;
	  }
	  
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /** Set a new numberOfYears �[�J��X�ҥ~�\�� */
  public void setNumberOfYears(int numberOfYears)throws inputException {
	 //����
	  if(numberOfYears<=0){
		  throw new inputException();
	  }else{
		   this.numberOfYears = numberOfYears;
	  }
	 
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return loanAmount;
  }

  /** Set a newloanAmount �[�J��X�ҥ~�\�� */
  public void setLoanAmount(double loanAmount)throws inputException {
    //����
	  if(loanAmount<=0){
		  //��J�p�󵥩�0�A�N��X�ҥ~
		  throw new inputException();
	  }else{
		  this.loanAmount = loanAmount;
	  }
	  
	  
    
  }

  /** Find monthly payment */
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
      (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
    return monthlyPayment;    
  }

  /** Find total payment */
  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;    
  }

  /** Return loan date */
  public java.util.Date getLoanDate() {
    return loanDate;
  }
}
/*�۩w�q�ҥ~*/
class inputException extends Exception{
	//�]�����~�ӡA�ҥH�㦳�򥻪�"�ҥ~"�\��
}
