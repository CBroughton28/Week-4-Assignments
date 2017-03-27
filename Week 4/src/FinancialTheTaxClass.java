import java.util.*;

@SuppressWarnings("unused")
public class FinancialTheTaxClass {

	public static void main(String[] args) 
	{
	 
		{
			
		}
		
		}
		class Tax{ 
			private int filingStatus; 
			public static final int SINGLE_FILER = 0; 
			public static final int MARRIED_JOINTLY_OR_QUALIFING_WINDOW = 1; 
			public static final int MARRIED_SEPARATELY = 2; 
			public static final int HEAD_OF_HOUSEHOLD = 3; 
				 	 
				 	 
		int[][] bracketsFor2001 = { 
			{27050,  65550,  136750, 297350},// Single filer 
			{45200,  109250, 166500, 297350},// Married jointly 
			{22600,  54625,  83250,  148675},// Married separately 
			{36250,  93650,  151650, 297350} // Head of household 
			}; 
				 	 
		int[][] bracketsFor2009 = { 
			{8350, 	33950, 82250, 	171550, 372950},// Single filer 
			{16700, 67900, 137050,	20885, 	372950},// Married jointly 
			{8350, 	33950, 68525,	104425, 186475},// Married separately 
			{11950, 45500, 117450,	190200, 372950} // Head of household 
			}; 
				 
				 
		double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391}; 
				 	 
		double[] ratesFor2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35}; 
				 
				 
		private double taxableIncome; 
				 	 
			Tax(){ 
				 		 
	} 
				 	 
		public void setfilingStatus(int filingStatus){ 
			this.filingStatus= filingStatus; 
	} 
			int getfilingStatus(){ 
				 return filingStatus; 
	} 
		public void settaxableIncome(int taxableIncome){ 
			this.taxableIncome= taxableIncome; 
	} 
			double gettaxableIncome(){ 
				 return taxableIncome; 
		
		} 
				 
				
		}
}
