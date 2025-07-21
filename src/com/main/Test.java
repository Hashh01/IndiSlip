package com.main;

import java.util.Scanner;

import com.model.Employee;
import com.service.PaySlip;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER EMPLOYEE NAME : ");
		String employeeName = s.nextLine();
		
		System.out.println("ENTER EMPLOYEE ID   : ");
		int employeeId = s.nextInt();
		s.nextLine();
		
		System.out.println("ENTER DESIGNATION   : ");
		String desgination = s.nextLine();
		
		System.out.println("ENTER DEPARTMENT    : ");
		String department = s.nextLine();
		
		System.out.println("ENTER PAY PERIOD    : ");
		String payPeriod = s.nextLine();
		
		System.out.println("ENTER WORKING  DAYS  : ");
		int workingDays = s.nextInt();
		
		System.out.println("ENTER LEAVE DAYS     : ");
		int leaveDays = s.nextInt();
		
		System.out.println("ENTER BASIC PAY      :" );
		float basic_Pay =s.nextFloat();
		
		System.out.println("ENTER INCENTIVE PAY  :" );
		float incentive_Pay = s.nextFloat();
		
		System.out.println("ENTER HOUS_RENT ALLOWANCCE : ");
        float house_Rent_Allowance = s.nextFloat() ;
        
        System.out.println("ENTER MEAL ALLOWANCE      : " );
        float meal_Allowance = s.nextFloat();
        
        System.out.println("ENTER PROVIDENT FUND : ");
        float provident_Fund = s.nextFloat();
        
        System.out.println("ENTER PROFESSIONAL TAX : ");
        float professional_Tax=s.nextFloat();
        
        System.out.println("ENTER LOAN            : ");
        float loan =s.nextFloat();
        
        Employee employee = new Employee(employeeName,employeeId,desgination,department,payPeriod,workingDays,leaveDays);
        
        PaySlip payslipService = new PaySlip(basic_Pay, incentive_Pay, house_Rent_Allowance, meal_Allowance, provident_Fund, professional_Tax, loan);
        
        payslipService.calculatePaySlip(employee);
        
 	
	}

}
