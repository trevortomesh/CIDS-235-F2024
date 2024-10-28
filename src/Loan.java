public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /**
     * Default Constructor
     **/
    public Loan() {
        this(2.5, 1, 1000);
    }

    /**
     * Construct a loan with specified annual interest rate,
     * number of years, and loan amount
     *
     * @param annualInterestRate
     * @param numberOfYears
     * @param loanAmount
     */
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /**
     * Return annual interest rate
     *
     * @return annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate
     *
     * @param annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    /** Return numberOfYears
     *
     * @return numberOfYears
     */
    public int getNumberOfYears(){
        return numberOfYears;
    }

    /** Set a new number of years
     *
     * @param numberOfYears
     */
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    /** return loanAmount
     *
     * @return loanAmount
     */
    public double getLoanAmount(){
        return loanAmount;
    }

    /** Set loanAmount
     *
     * @param loanAmount
     */
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1-(1/Math.pow(1+monthlyInterestRate, numberOfYears*12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears *12;
        return totalPayment;
    }

    /** Return loan date
     *
     * @return loanDate
     */

    public java.util.Date getLoanDate(){
        return loanDate;
    }

}
