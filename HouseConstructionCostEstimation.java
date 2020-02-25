package hometask5;

import java.util.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class HouseConstructionCostEstimation
{
	private static final Logger LOGGER = LogManager.getLogger(HouseConstructionCostEstimation.class);
	void costPerSquareFeet()
	{
		Scanner sc = new Scanner(System.in);
		String standard;
		int totalCost = 0,costPerSquareFeet = 0,totalArea = 0;
		String automation = "";
		boolean checkAutomation = true;
		LOGGER.info("Enter the standard(Normal Standard/Above Standard/High Standard)(Case sensitive) : ");
		standard = sc.nextLine();
		if(standard.equals("High Standard")) 
		{
			LOGGER.info("Do you need full automation in house (Yes/No) ? ");
			automation = sc.nextLine();
		}
		if(automation.equals("Yes") || automation.equals("yes") || automation.equals("YES"))
			checkAutomation = true;
		else if(automation.equals("No") || automation.equals("no") || automation.equals("NO"))
			checkAutomation = false;
		LOGGER.info("Enter the total area(in square feets):");
		totalArea = sc.nextInt();
		if(standard.equals("Normal Standard"))
			costPerSquareFeet = 1200;
		else if(standard.equals("Above Standard"))
			costPerSquareFeet = 1500;
		else if(standard.equals("High Standard") && checkAutomation == true)
			costPerSquareFeet = 2500;
		else if(standard.equals("High Standard") && checkAutomation == false)
			costPerSquareFeet = 1800;
		totalCost = costPerSquareFeet * totalArea;
		System.out.printf("Estimated house construction cost : %dINR\n",totalCost);
		sc.close();
	}
}