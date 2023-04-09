 import java.text.DecimalFormat;

public class Loan {
        double loanAmount;
        double interestRate;
        double lengthOfLoan;
        double total;
        double totalIntRate;
        double monthlyPayment;
        double totalMonthlyPayment;

        public Loan (double principal, double intRate, double loanTerm) {
            loanAmount = principal;
            interestRate = intRate / 100;
            lengthOfLoan = loanTerm;
        }

        public double totalMonthlyDue () {
            double monthlyInterest = interestRate / 12;
            double calc1 = 1 + monthlyInterest;
            double exponentCalculation = Math.pow(calc1, lengthOfLoan);
            return totalMonthlyPayment = Math.round(loanAmount * ((monthlyInterest * exponentCalculation) / (exponentCalculation - 1)));
        }


        public static void main(String[] args) {
            Loan carLoan = new Loan(30000, 3, 48);
            double monthlyPayment = carLoan.totalMonthlyDue();
            System.out.println(monthlyPayment);
        }
    }