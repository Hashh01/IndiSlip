package com.service;

import com.model.Employee;

public class PaySlip {
	
	private float basic_Pay;
	private float incentive_Pay;
	private float house_Rent_Allowance;
	private float meal_Allowance;
	private float provident_Fund;
	private float professional_Tax;
	private float loan;
	
	
	public PaySlip(float basic_Pay, float incentive_Pay, float house_Rent_Allowance, float meal_Allowance,
			float provident_Fund, float professional_Tax, float loan) {
		super();
		this.basic_Pay = basic_Pay;
		this.incentive_Pay = incentive_Pay;
		this.house_Rent_Allowance = house_Rent_Allowance;
		this.meal_Allowance = meal_Allowance;
		this.provident_Fund = provident_Fund;
		this.professional_Tax = professional_Tax;
		this.loan = loan;
	}
	
	public void calculatePaySlip(Employee employee)
	{
		float totalEarnings = basic_Pay + incentive_Pay + house_Rent_Allowance + meal_Allowance ;
		float totalDeductions = professional_Tax + professional_Tax;
		float netPay = totalEarnings - totalDeductions;
		
		System.out.println("\n\n===================================================");
	    System.out.println("                  EMPLOYEE PAY SLIP                ");
	    System.out.println("===================================================");
	    System.out.printf("Employee Name     : %-30s%n", employee.getEmpName());
	    System.out.printf("Employee ID       : %-30s%n", employee.getEmpId());
	    System.out.printf("Department        : %-30s%n", employee.getDepartment());
	    System.out.printf("Designation       : %-30s%n", employee.getDesgination());
	    System.out.printf("Working Days      : %-30d%n", employee.getWorkingDays());
	    System.out.printf("Leave Days        : %-30d%n", employee.getLeaveDays());
	    
	    System.out.println("---------------------------------------------------");
	    System.out.println("                     EARNINGS                      ");
	    System.out.println("---------------------------------------------------");
	    System.out.printf("Basic Pay         : ₹ %.2f%n", basic_Pay);
		System.out.printf("Incentive Pay     : ₹ %.2f%n", incentive_Pay);
	    System.out.printf("House Rent Allow. : ₹ %.2f%n", house_Rent_Allowance);
	    System.out.printf("Meal Allowance    : ₹ %.2f%n", meal_Allowance);
	    System.out.printf("Total Earnings    : ₹ %.2f%n", totalEarnings);
	    
	    System.out.println("---------------------------------------------------");
	    System.out.println("                     DEDUCTIONS                    ");
	    System.out.println("---------------------------------------------------");
	    System.out.printf("Provident Fund    : ₹ %.2f%n", provident_Fund);
	    System.out.printf("Professional Tax  : ₹ %.2f%n", professional_Tax);
	    System.out.printf("Loan Deduction    : ₹ %.2f%n", loan);
	    System.out.printf("Total Deductions  : ₹ %.2f%n", totalDeductions);
	    
	    System.out.println("===================================================");
	    System.out.printf("Net Pay           : ₹ %.2f%n", netPay);
	    System.out.println("===================================================");
	}
	
	

}
