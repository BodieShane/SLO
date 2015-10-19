package sloPackage;

import  sloPackage.SLOcontroller;
import sloPackage.SLOview;

import java.util.Scanner;
public class SLOcontroller
{
	private SLOview BodiesProject;
	private int score;
	private boolean hasPassed;
	private double  AnswerToNumberSix;
	private Scanner SLOscanner;
	
	public SLOcontroller()
	{
		score = 100;
		hasPassed = true;
		AnswerToNumberSix = 93269.568;
	
		SLOscanner = new Scanner(System.in);
		
	}
	public void start()
	{
		
		
		System.out.println("What is the answer to Number six?");
		AnswerToNumberSix = SLOscanner.nextDouble();
		
	
		if (AnswerToNumberSix == 93269.568)
		{
			System.out.println("Good job on getting number 6 right btw ");
		}
		else
		{
			System.out.println("HOW DID YOU MISS NUMBER SIX IT IS THE SIMPLEST ONE");
			score = 0;
			
		}
		
		
		if (score >= 70)
		{
			
				System.out.println("Your score is " + score  );
			
		}
		else
		{
			System.out.println("Your score is " + score + " that is less then 70 you did not pass." );
			hasPassed = false;
		}
		
		if (hasPassed == true)
		{
			System.out.println("you have passed");
		}
		else 
		{
			System.out.println("You have not passed. I don’t know how. Like You really had to try to not pass this test. No but really how. This is impossible to not pass unless you changed the code itself. Good job on being that bad. ");
		}
		
		
		
		
	}	 
	
	
	
	
	
	

}
