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
				infectedCount = infectedCount + 5 + 3*8; // 3 even day in weeks except Day 8
				
			} else if (week % 2 == 0){
				infectedCount = infectedCount + 4*8; // in even week we have 4 even days
			
			} else {
				infectedCount = infectedCount + 3*8; // in odd week we have 3 even days
			}
			
			System.out.println("Number of instructors infected after week '" + week + "' : " + infectedCount);
		
		}
			
		System.out.println("\nTotal Number of instructors infected after '" + numberOfWeeks +"' weeks  : " + infectedCount);
		
		input.close();
		
		}
		

}

