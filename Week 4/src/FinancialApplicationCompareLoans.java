import java.util.Scanner; 
 
public class FinancialApplicationCompareLoans {

 
 	    public static void main(String[] args) { 
 
 	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 
 	        double annualInterestRate = 5.00; 
 	            
 	        
 	        System.out.printf("Loan amount: "); 
 	        double loanAmount = input.nextDouble(); 
  
 	        System.out.print("Number of Years: "); 
 	        int numberOfYears = input.nextInt(); 

 	        System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment"); 
 	       
 	        for ( ; annualInterestRate <= 8.00; annualInterestRate += 0.125) { 
 
 
 	           
 	            double monthlyInterestRate = annualInterestRate / 1200; 
 	            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)); 
 
 
 	            double totalPayment = monthlyPayment * numberOfYears * 12; 
 
 	            String str = "%"; 
 
 	            System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualInterestRate , str, ((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0)); 
 
 
 	        } 

 
 	    } 
 	} 
 	 



