/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author thato
 */
public class MonthlySalary {
    
     private static double pensionFunds(double percentage, double monthlySalary) {
          double funds;
        
        funds = percentage * monthlySalary / 100;
                return funds;
    }
    
 
  
        public static double netSalary(double pensionFund,int medicalAid,double monthlySalary){
        double grossSalary;
        
        grossSalary = monthlySalary - medicalAid - pensionFund;
        return grossSalary;
    }
    
    
   
     
    public static void main(String[] args) {
        String surname;
        int staffCode;
        double grossSalary;
        double monthlySalary;
        double pensionFund;
        int medicalAid = 1500;
        double percentage = 8;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the surname: ");
        surname = input.nextLine();
        
        System.out.print("Enter the staff code:");
        staffCode = input.nextInt();
        
        System.out.print("Enter the monthly salary:");
        monthlySalary = input.nextDouble();
        
       
       pensionFund = pensionFunds(percentage,monthlySalary);
       grossSalary = netSalary(pensionFund,medicalAid,monthlySalary);
       
        System.out.println("the pension fund is: " + pensionFund);
        System.out.println("gross salary amound after pension: " + grossSalary);
        
        
         
    }

  
   
    
}
