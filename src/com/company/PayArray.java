package com.company;

import java.util.Scanner;

public class PayArray {

    public static void main(String[] args) {
	final  int NUM_EMPLOYEES=5;
	int[] hours= new int [NUM_EMPLOYEES];
	double payRate;
	double grossPay;
	double overTime;
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the hours worked by the Emplotyee");
        for(int i = 0; i< NUM_EMPLOYEES; i++)
        {
            System.out.println(" Employees # "+ (i+1)+ ": ");
            hours[i]=input.nextInt();


        }
        System.out.println("Enter the hourley rate for each Employee: ");
        payRate= input.nextDouble();
        System.out.println("Here is the gross pay for each employee:");
        for(int i= 0; i<NUM_EMPLOYEES; i++)
        {
            if(hours[i]>40)
            {
                grossPay= 40*payRate;
                overTime= (hours[i]-40)*(1.5*payRate);
                grossPay += overTime;
            }
            else
                grossPay= hours[i]*payRate;
            System.out.println("Employees#" + (i+1)+ ": $"+ grossPay);
        }
    }
}
