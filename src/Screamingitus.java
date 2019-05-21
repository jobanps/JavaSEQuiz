import java.util.Scanner;

//Student Id : C0748529 - Jobanpreet Singh 

public class Screamingitus {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of weeks to know infection rate for ");
		int numberOfWeeks = input.nextInt();
		int numberOfDays = numberOfWeeks * 7;
		int infectedCount = 0;
		
		for(int i = 1 ; i <= numberOfWeeks ; i++) {
			
			if(i == 1) {
				infectedCount = 1 + 30 ;	// Day 1 + remainingDays * 5
			}
			else {
				infectedCount = infectedCount + 35; // infected + numbers_of_Days_In_a_Week * 5 (current week)
			}
			
	
			System.out.println("Number of instructors infected after week '" + i + "' : " + infectedCount);
		}
			
		System.out.println("\nTotal Number of instructors infected after '" + numberOfWeeks +"' weeks  : " + infectedCount);
		
		input.close();
		
		}
		

}

