package edu.handong.csee.java.lab06;

import java.util.Scanner;

public class Cesco {

	final double GROWTH_RATE = 0.95;
	final double ONE_BUG_VOLUME = .002;
	public static void main(String[] args) 
	{
		Cesco myCesco = new Cesco();
		myCesco.computeNumOfBugsToUseFKiller();
	}

	public void computeNumOfBugsToUseFKiller()
	{
		System.out.println("Type in the houseVolume : ");
		Scanner keepWork = new Scanner(System.in);
		double houseVolume = keepWork.nextDouble();
		System.out.println("Type in the Start Population : ");
		double startPopulation = keepWork.nextDouble();
		
		double population = startPopulation;
		
		double totalBugVolume = population + ONE_BUG_VOLUME;
			
		int countWeeks = 0;
		
		while (totalBugVolume < houseVolume)
		{
			double newBugs = population * GROWTH_RATE;
			double newBugVolume = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugVolume = population * ONE_BUG_VOLUME;
			countWeeks = countWeeks + 1;
		}
		
		System.out.println("startPop = " + startPopulation);
		System.out.println("houseVol = " + houseVolume);
		System.out.println("countWeek = "+ countWeeks);
		System.out.println("Pop = "+ countWeeks);
		System.out.println("totalBugVol= "+ (int)totalBugVolume);
	}
}
