package src.main.java;

import java.util.Scanner;

public class BugInfestation {
	final double GROWTH_RATE = 0.95;
	final double ONE_BUG_VOLUME = .002;
	public void computeNumOfBugsToUseFKiller()
	{
		System.out.println("Type in the houseVolume : ");
		Scanner keepWork = new Scanner(System.in);
		double houseVolume = keepWork.nextDouble();
		System.out.println("Type in the Start Population : ");
		double startPopulation = keepWork.nextDouble();
		keepWork.close();
		double population = startPopulation;
		
		double totalBugVolume = population + ONE_BUG_VOLUME;
			
		int countWeeks = 0;
		
		while (totalBugVolume < houseVolume)
		{
			double newBugs = population * GROWTH_RATE;
			double newBugVolume = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugVolume += newBugVolume; 
			countWeeks = countWeeks + 1;
		}
		
		System.out.println("startPop = " + startPopulation);
		System.out.println("houseVol = " + houseVolume);
		System.out.println("countWeek = "+ countWeeks);
		System.out.println("Pop = "+ countWeeks);
		System.out.println("totalBugVol= "+ (int)totalBugVolume);
	}
}
