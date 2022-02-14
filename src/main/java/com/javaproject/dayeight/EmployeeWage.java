package com.javaproject.dayeight;

public class EmployeeWage {

    static final int is_Full_Time = 1;
    static final int is_Part_Time = 2;
    static final int emp_Rate_Per_Hr = 20;
    static final int num_Of_Working_Days = 20;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println();
        employeeWage();
    }

    public static void employeeWage(){
        int total_Working_Days = 0;
        int max_Working_Hrs = 100;
        int total_Employee_Wage=0;
        int total_Emp_Hrs = 0;
        int emp_Hrs = 0;

        while(total_Emp_Hrs < max_Working_Hrs && total_Working_Days < num_Of_Working_Days){
            total_Working_Days++;
            double emp_Check = Math.floor(Math.random() * 10) % 3;
            if(emp_Check == is_Full_Time){
                System.out.println("Employee is an Full Time Employee");
                emp_Hrs = 8;
            }
            else if(emp_Check == is_Part_Time){
                System.out.println("Employee is an Part Time Employee");
                emp_Hrs = 4;
            }
            else{
                System.out.println("Employee is Absent");
            }
            total_Emp_Hrs =total_Emp_Hrs + emp_Hrs;
            System.out.println("Total Employee Hours is " +total_Emp_Hrs);
        }
        total_Employee_Wage = total_Emp_Hrs * emp_Rate_Per_Hr;
        System.out.println("Total Salary of an Employee is " +total_Employee_Wage);
    }
}
