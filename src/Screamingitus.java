import java.util.Scanner;

//Student Id : C0748529 - Jobanpreet Singh 

public class Screamingitus {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of weeks to know infection rate for ");
		int numberOfWeeks = input.nextInt();
		int infectedCount = 0;
		
		for(int week = 1 ; week <= numberOfWeeks ; week++) {
			
			if(week == 1) {
				infectedCount = 1 + 30 ;	// Day 1 + remainingDays * 5
			
			} else if(week == 2) {
				infectedCount = infectedCount + 5 + 48; // total + infected for 8 day + 6 * 5 (remaining week)
				
			} else {
				infectedCount = infectedCount + 56; // infected + numbers_of_Days_In_a_Week * 5 (current week)
			
			}
			
			System.out.println("Number of instructors infected after week '" + week + "' : " + infectedCount);
		
		}
			
		System.out.println("\nTotal Number of instructors infected after '" + numberOfWeeks +"' weeks  : " + infectedCount);
		
		input.close();
		
		}
		

}

