package com.demo.LMS;

import java.util.Scanner;

import com.menu.Menu;

/**
 * LMS
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		String u_name;
		String pass;
		String uname = "Saurabh45";
		String upass = "Singh1234";
		System.out.println("****************WELCOME TO LIBRARY MANAGEMENT SYSTEM*************");
		System.out.println("                          Admin login");
		System.out.println("Enter Username: ");
		u_name = sc.next();
		System.out.println("Enter Password: ");
		pass = sc.next();

		if (u_name.equals(uname) && pass.equals(upass)) {
			System.out.println("                      Login Success");
			Menu m = new Menu();
			m.menu();

		} else {
			System.out.println("                      Access denied");
		}
		sc.close();
		
		
    }
}
