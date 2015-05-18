//U10116048 楊明璋 HW8_14_4 修改的LOAN CLASS
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

  /** Set a new annualInterestRate 加入丟出例外功能 */
  public void setAnnualInterestRate(double annualInterestRate)throws inputException {
    //條件
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

  /** Set a new numberOfYears 加入丟出例外功能 */
  public void setNumberOfYears(int numberOfYears)throws inputException {
	 //條件
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

  /** Set a newloanAmount 加入丟出例外功能 */
  public void setLoanAmount(double loanAmount)throws inputException {
    //條件
	  if(loanAmount<=0){
		  //輸入小於等於0，就丟出例外
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
/*自定義例外*/
class inputException extends Exception{
	//因為有繼承，所以具有基本的"例外"功能
}
