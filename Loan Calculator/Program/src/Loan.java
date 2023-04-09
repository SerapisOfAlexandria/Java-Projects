public class Loan {
    double principial;
    double interestRate;
    double loanTerm; // in terms of months
    double loanPayments; // the amount of money that must be paid in every time interval
    double downPayment; // The amount of money that can be deposited initially plus the loan payments
   /*
            How the program should work:

       Let's say someone loans a 100,000$ loan with 4% interest rate, 12-month loan term, and one-half down payment,
       paid in the first half of the total term.
       The program should be able to calculate the total cost of the loan(loan + interest rate), how much each loanPayment
       should be. Example:



     */


    public Loan(double loanAmount, double lenghtOfLoan, double initialDeposit) {
        principial = loanAmount;
        loanTerm = lenghtOfLoan;
        downPayment = initialDeposit;

    }
            // Interest rate calculator
    public void intRateCalculator() {
        if (loanTerm <= 12) {
            if (downPayment >= downPayment / 2 || downPayment >= downPayment / 3) {
                interestRate = .4;
            } else {
                interestRate = .45;
            }
        } else if (loanTerm <= 36) {
            if (downPayment >= downPayment / 2 || downPayment >= downPayment / 3 || downPayment >= downPayment / 4) {
                interestRate = .5;
            } else {
                interestRate = .55;
            }
        } else {
            if (downPayment >= downPayment / 2 || downPayment >= downPayment / 3 || downPayment >= downPayment / 4) {
                interestRate = .6;
            } else {
                interestRate = .65;
            }
        }
    }

    public static void main(String[] args) {

    }
}