package ben.smu.test;

import java.util.Scanner;

public class MortgagePaymentRecalc {

	private static void inputData(Scanner snRec, String[] strCustName, double[] dblMtgBal, double[] dblIntRate,
			double[] MthlyPmt, double[] XMthlyPmt) {
		for(int i=0; i<strCustName.length; i++) {
			System.out.print("Enter name of customer "+ (i+1) +" : ");
			strCustName[i] = snRec.next();
			
			System.out.print("Enter name of customer "+ (i+1) +" : ");
			strCustName[i] = snRec.next();
			
			System.out.print("Enter name of customer "+ (i+1) +" : ");
			strCustName[i] = snRec.next();
			
			System.out.print("Enter name of customer "+ (i+1) +" : ");
			strCustName[i] = snRec.next();
			

		}
	}

	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");
		System.out.flush();

		System.out.println("\t\t\t Program to Recalculate Mortgage Payments ");
		System.out.print("Enter the number of records: ");
		Scanner snRec = new Scanner(System.in);
		int intRecNum = snRec.nextInt();

		String[] strCustomerNames = new String[intRecNum];
		double[] dblMortgageBalance = new double[intRecNum];
		double[] dblInterestRate = new double[intRecNum];
		double[] dblMonthlyPayment = new double[intRecNum];
		double[] dblXtrMothlyPayment = new double[intRecNum];

		inputData(snRec,strCustomerNames,dblMortgageBalance,dblInterestRate,dblMonthlyPayment,dblXtrMothlyPayment);

		snRec.close();
	}

}
