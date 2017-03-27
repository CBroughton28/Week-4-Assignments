import java.util.*;

public class GameTicTacToe {

	private static String answer;
	private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in); 
		String[][] tictac = {{" "," "," "},{" "," "," "},{" "," "," "}}; 
		setAnswer(" "); 
		String token;  
		int turn = 1; 
		int i; 
		int j; 
		int count = 0; 
		while (count<3||turn< 9){ 
			if(turn%2==0) 
		 		token = "X"; 
		 	else 
		 		token =  "O"; 
	System.out.print("Enter a row (0, 1, 2) for Player "+token+ ": "); 
		 	i=input.nextInt(); 
		 	input.nextLine(); 
	System.out.print("Enter a column (0, 1, 2) for Player "+token+ ": "); 
		 	j=input.nextInt(); 
		 	input.nextLine();	 
		 	tictac[i][j] =token;  
	System.out.printf("-------------\n| %s | %s | %s |\n-------------\n| %s | %s | %s |\n-------------\n| %s | %s | %s |\n-------------\n", tictac[0][0],tictac[0][1],tictac[0][2],tictac[1][0],tictac[1][1],tictac[1][2],tictac[2][0],tictac[2][1],tictac[2][2]); 
		 			 
		 	for (int m = 0; m < 3; m ++ ){ 
		 			 
		 	for (int k = 0; k < 3;k++){ 
		 	if(tictac[m][k]==token) 
		 		count++;	 
} 
		 	if(count==3){ 
	System.out.print(token+ " player won"); 
		 	count=4; 
		 	break; 
} 
		 else 
		 	count=0; 
} 
		 for (int m = 0; m < 3; m ++ ){ 
		 			 
		 for (int k = 0; k < 3;k++){ 
		 if(tictac[k][m]==token) 
		 count++;	 
} 
		 if(count==3){ 
	System.out.print(token+ " player won"); 
		 count=4; 
		 break; 
} 
		 else 
		 	count=0; 
} 
	if(tictac[0][0].equals(tictac[1][1])&& tictac[1][1].equals(tictac[2][2])&&tictac[0][0]==token){ 
	System.out.print(token+ " player won"); 
		 	count=4; 
		 break; 
} 
	if(tictac[0][2].equals(tictac[1][1])&& tictac[1][1].equals(tictac[2][0])&&tictac[0][2]==token){ 
	System.out.print(token+ " player won"); 
		 	count=4; 
		 break; 
} 
		 	turn++; 
	if(turn==10) 
		 	count=3; 
} 
	if(turn==10 && count!=4 ) 
	System.out.print("The game was a draw."); 
	}

	public static String getAnswer() {
		return answer;
	}

	public static void setAnswer(String answer) {
		GameTicTacToe.answer = answer;
	} 
}

		