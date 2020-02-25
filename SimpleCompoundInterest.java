package hometask5;

import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class SimpleCompoundInterest  {
	private static final Logger LOGGER = LogManager.getLogger(SimpleCompoundInterest.class);
	public void calculate()
	{
		double principalAmount = 0.0, simpleInterest = 0.0,compoundInterest = 0.0;
		int numberOfTimes = 0,rateOfInterest = 0, time = 0;
	    Scanner sc=new Scanner (System. in);
	    LOGGER.info("Enter the principal amount:");
	    principalAmount = sc.nextDouble();
	    LOGGER.info("Enter the time(in years):");
	    time = sc.nextInt();
	    LOGGER.info("Enter the Rate of  interest:");
	    rateOfInterest=sc.nextInt();
	    LOGGER.info("Enter the number of times:");
	    numberOfTimes=sc.nextInt();
		simpleInterest=(principalAmount * time * rateOfInterest)/100;
		compoundInterest=principalAmount * Math.pow(1.0 + rateOfInterest / numberOfTimes,(numberOfTimes * time)) - principalAmount;
		System.out.printf("Simple Interest=%f\n",simpleInterest);
		System.out. printf("Compound Interest=%f\n",compoundInterest);
		sc.close();
	}
}