package EmployeeWage.services;

import EmployeeWage.interfaces.IwageCopmutation;
import EmployeeWage.utility.FileHandlingOfSelf;

public class ImplWageComputation implements IwageCopmutation
{

	FileHandlingOfSelf fileHandling = new FileHandlingOfSelf();		//file_handling


	public void displayMessage()
	{
		System.out.println(" :: Welcome To Employement Wage Computation :: ");
		fileHandling.createFile();
	}

	private int employeesPresent() 
	{
		int present = (int) (Math.random() * 100 + 20);
		return present;
	}

	private int employeesWagePerDay(int wagePerHour, int TimeHour, int numberOfEmployees) 
	{
		int wagePerDay = TimeHour * wagePerHour * numberOfEmployees;
		return wagePerDay;
	}

	public int employeesPresentFullTime()
	{
		int present = employeesPresent();
		System.out.println("Full_Time Employees Present :: " + present + '\n');
		fileHandling.writeFile("Full_Time Employees Present :: " + present);		//file_handling
		return present;
	}

	public int dailyFullTimeEmployeeWage(int wagePerHour, int fullDayHour, int numberOfEmployees) 
	{
		int wagePerDay = employeesWagePerDay(wagePerHour, fullDayHour, numberOfEmployees);
		System.out.println("EmployementWage for a Full_Timer For Today :: " + wagePerDay + '\n');
		fileHandling.writeFile("EmployementWage for a Full_Timer For Today :: " + wagePerDay);		//file_handling
		return wagePerDay;
	}

	public int employeesPresentPartTime() 
	{
		int present = employeesPresent() / 3;
		System.out.println("Part_Time Employees Present :: " + present + '\n');
		fileHandling.writeFile("Part_Time Employees Present :: " + present );		//file_handling
		return present;
	}

	public int dailyPartTimeEmployeeWage(int wagePerHour, int PartTimeHour, int numberOfEmployees)
	{
		int wagePerDay = employeesWagePerDay(wagePerHour, PartTimeHour, numberOfEmployees);
		System.out.println("EmployementWage for a Part_Timer Per Day :: " + wagePerDay + '\n');
		fileHandling.writeFile("EmployementWage for a Part_Timer Per Day :: " + wagePerDay ); //file_handling
		return wagePerDay;
	}

	public int wageForMonth(int workingDays, int wagePerHour, int TimeHour) 
	{
		int totalWageForMonth = 0;
		for (int i = 1; i <= workingDays; i++) {
			int numberOfEmployees = employeesPresent();
			System.out.println(
					"Wage on Day{ " + i + " } :: " + employeesWagePerDay(wagePerHour, TimeHour, numberOfEmployees));
			fileHandling.writeFile("Wage on Day{ " + i + " } :: " + employeesWagePerDay(wagePerHour, TimeHour, numberOfEmployees));	//file_handling
			totalWageForMonth = totalWageForMonth + employeesWagePerDay(wagePerHour, TimeHour, numberOfEmployees);
		}
		System.out.println("Total Wage Given To All The Employees for the Month :: " + totalWageForMonth + '\n');
		fileHandling.writeFile("Total Wage Given To All The Employees for the Month :: " + totalWageForMonth );	//file_handling
		return totalWageForMonth;
	}

	public void workingHoursOrDaysReachFirst(int timeHour) {
		byte day = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % timeHour == 0) {
				day = (byte) (day + 1);
			} else {
				day = (byte) (day + 0);
			}
		}
		System.out.println(day < 20 ? "Total Working Hour Reached First" : " Total Working Days Reached First.");
	}
}




