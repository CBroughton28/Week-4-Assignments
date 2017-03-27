

public class FinancialApplicatioFindTheSalesAmount {

	public static void main(String[] args) { 
		double max= 25000; 
		double sales = 10000; 
		double commission = 0; 
		 	 
		while (commission <= max){ 
		 	if (sales>10000) 
		 		commission = (sales - 10000)*.12 + (5000)*.1 + (5000)*.08; 
		 		 
		else if (sales>5000 && sales<=10000) 
		 		commission = (sales-5000)*.1 + (5000)*.08; 
		 			 
		else 
		 	commission = (sales)*.08;  
		 		 
		 sales +=.01; 
				 
	} 
		commission = commission + 5000; 
		System.out.printf("To earn $%.2f per year a salesman needs to make $%.2f in sales per year.",commission, sales); 
} 
   } 
