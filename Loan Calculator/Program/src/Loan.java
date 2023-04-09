import java.text.DecimalFormat;

/*
This program shows how much a loan will cost.
It takes the principal and applies the specified interest rate,
it can also calculate the cost of each monthly payment (with interest rate).
Example: 50,000$ loan with 6% interest and 3-year loan term will:
        Cost: 4756$
        Require you to pay(each month): 1521$

*/
public class Loan {
        double loanAmount;
        double interestRate; //in terms of percents
        double lengthOfLoan; //in terms of months
        double totalMonthlyPayment;

        public Loan (double principal, double intRate, double loanTerm) {
            loanAmount = principal;
            interestRate = intRate / 100;
            lengthOfLoan = loanTerm;
        }

            //Calculates how much will each monthly payment be
        public double totalMonthlyDue () {
            double monthlyInterest = interestRate / 12;
            double calc1 = 1 + monthlyInterest;
            double exponentCalculation = Math.pow(calc1, lengthOfLoan);
            return totalMonthlyPayment = Math.round(loanAmount * ((monthlyInterest * exponentCalculation) / (exponentCalculation - 1)));
        }

        public static void main(String[] args) {
            Loan carLoan = new Loan(100000, 6, 12);
            double monthlyPayment = carLoan.totalMonthlyDue();
            System.out.println("Monthly Repayment will be: " + monthlyPayment + "$");
            System.out.println("Total amount of the loan will be: " + Math.round(monthlyPayment * carLoan.lengthOfLoan) + "$");
            System.out.println("Therefore the loan will cost: " + Math.round((monthlyPayment * carLoan.lengthOfLoan) - carLoan.loanAmount) + "$");
        }
    }