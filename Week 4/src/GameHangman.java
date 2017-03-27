import java.util.*;

public class GameHangman {

	private static Scanner input;
	public static void main(String[] args) 
	{ 
		input = new Scanner(System.in); 
		String [] words = {"testing", "string", "java", "safe", "manners", "again", "repeat"}; 
		char answer = ' '; 
		char letter = ' '; 
		StringBuilder answer0 = new StringBuilder(" is not in the word"); 
		StringBuilder answer1 = new StringBuilder(" is already in the word"); 
		int missed = 0; 
		while (answer != 'n'){ 
		int x = (int)(Math.random()*(7)); 
		char[] word = words[x].toCharArray();	 
		for (int i =0; i< word.length; i++) 
			 word[i]= '*'; 
		String newword = new String(word);	 
		System.out.print("(Guess) Enter a letter in word " + newword + " > ");	 
		while(words[x].equals(newword)==false){ 
			 letter = input.next().charAt(0); 
			 				 
			 if(check1(letter, words[x], newword)==0){ 
			 	System.out.print(answer0.insert(0, letter) +"\n(Guess) Enter a letter in word "+newword + " >"); 
			 		missed++; 
			 		answer0.deleteCharAt(0); 
	} 
			else if(check1(letter, words[x], newword)==1){ 
			 System.out.print(answer1.insert(0, letter) +"\n(Guess) Enter a letter in word "+newword + " >"); 
			 	answer1.deleteCharAt(0); 
	} 
						 
			else if(check1(letter, words[x], newword)==2) 
		 	break; 
			 				 
		 	else{ 
		 System.out.print("(Guess) Enter a letter in word " + check(letter, words[x], newword) + " >"); 
		 newword=check(letter, words[x], newword); 
} 
} 
		System.out.print("\nThe word was " + words[x] + ", you missed " + missed +" times.\nDo you want to guess another word? Enter y or n> " ); 
		answer = input.next().charAt(0); 
} 
	} 
		public static  int check1(char a, String hang, String man){ 
		int count = 0; 
		char [] cha = hang.toCharArray(); 
		char [] chb = man.toCharArray(); 
		for (int i = 0; i<cha.length; i++) 
		if (cha[i]==a){ 
		chb[i] = a; 
		count++; 
	} 
		String checked = new String(chb); 
		if (count==0) 
			return 0; 
		if (checked.equals(man)) 
			return 1; 
		if (checked.equals(hang)) 
			return 2; 
		else 
			return 3; 
} 
	public static  String check(char a, String hang, String man){ 
		char [] cha = hang.toCharArray(); 
		char [] chb = man.toCharArray(); 
		for (int i = 0; i<cha.length; i++) 
		if (cha[i]==a) 
			chb[i] = a; 
	 	String checked = new String(chb);			 
	 	return checked; 
	}  
			 
} 
	