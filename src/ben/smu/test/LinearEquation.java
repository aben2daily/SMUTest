package ben.smu.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class LinearEquation {
	
	public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("\t\t\t Program to Calculates Linear Equation {a^(2x) - a^x + 1}");
        System.out.print("Enter the value of a: ");
        
        Scanner coA = new Scanner(System.in);
        int intCoA = coA.nextInt();
        
        System.out.println("\t\t x"+  "\t\t\t Answer");
        
        for(int x=1;x<=intCoA;++x){
            BigDecimal douPart1 = new BigDecimal(Math.pow(intCoA, (2*x)));
            BigDecimal douPart2 = new BigDecimal(Math.pow(intCoA, x));
            
            BigDecimal douAns = douPart1.subtract(douPart2).add(new BigDecimal(1));

            System.out.println("\t\t"+ x  + "\t\t\t"+ douAns);
        }
        coA.close();
    }

}
