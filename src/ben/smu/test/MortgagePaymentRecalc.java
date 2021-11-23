package ben.smu.test;

import java.util.Scanner;

public class MortgagePaymentRecalc {

	private static void inputData(int intNoOfRecords) {
		
	}
	public static void main(String[] args) {

		System.out.print("\033[H\033[2J");  
        System.out.flush();
        
        System.out.println("\t\t\t Program to Recalculate Mortgage Payments ");
        System.out.print("Enter the number of records: ");
        Scanner recNum = new Scanner(System.in);
        int intRecNum = recNum.nextInt();
		
		inputData(intRecNum);
		
		recNum.close();
	}

}
