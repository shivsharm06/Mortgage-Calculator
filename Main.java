package Mortgage;


public class Main {

    public static void main(String[] args) {
            int principal = (int) Console.readNumber("Enter the amount you want to loan: ", 1000, 1_000_000);
            float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
            byte years = (byte) Console.readNumber("In how many years do you want to repay the loan: ", 1, 30);

            var calculator=new MortgageCalculator(principal,annualInterest,years);
            var report=new MortgageReport(calculator);

            report.printMortgage();
            report.printPaymentSchedule();
        }
    public static void Introduction(String name) {

        System.out.println("Hi " + name);
    }
}
