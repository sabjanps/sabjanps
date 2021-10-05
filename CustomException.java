package com.te.hibernatedemo.bean.Employee;

public class CustomException extends Exception{

     public static String EmployeeNotFound()
     {
         return "Employee Not Found";
	}
     public static void main(String[] args) {
    	 EmployeeNotFound();
	}
	

}
