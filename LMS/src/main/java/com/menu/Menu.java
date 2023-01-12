package com.menu;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.LMS;

public class Menu {
	public void menu() {
		Scanner s = new Scanner(System.in);
		int ch;
		System.out.println("Select the operation you want to create: ");
		System.out.println();
		System.out.println("1. Insert New Library Data");
		System.out.println("2. See existing Library Data");
		System.out.println("3. Update any Data");
		System.out.println("4. Delete any Data");
		System.out.println();
		System.out.println("Enter your choice: ");
		ch = s.nextInt();

		SessionFactory sf = com.connection.Connection.con();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		switch (ch) {
		case 1:
			LMS l1 = new LMS();
			System.out.println("Enter Serial Number: ");
			l1.setS_no(s.nextInt());
			System.out.println("Enter Book ID: ");
			l1.setB_ID(s.nextInt());
			System.out.println("Enter Book name: ");
			l1.setB_Name(s.next());
			System.out.println("Enter Name of Author: ");
			l1.setB_Author(s.next());
			System.out.println("Enter issued to which student: ");
			l1.setB_Issued_To(s.next());
			System.out.println("Enter Issue Date: ");
			l1.setIssue_Date(s.next());
			sess.save(l1);
			tr.commit();
			System.out.println("Object Saved...");

			break;
		case 2:
			LMS read = new LMS();
			System.out.println("Enter Serial Number: ");
			read = sess.get(LMS.class, s.nextInt());
			System.out.println(read);
			tr.commit();
			break;
			
		case 3:
			LMS update = new LMS();
			System.out.println("Enter Serial Number: ");
			update = sess.load(LMS.class, s.nextInt());
			System.out.println("Enter Book ID: ");
			update.setB_ID(s.nextInt());
			System.out.println("Enter Book name: ");
			update.setB_Name(s.next());
			System.out.println("Enter Author name: ");
			update.setB_Author(s.next());
			System.out.println("Enter Issued to which student: ");
			update.setB_Issued_To(s.next());
			System.out.println("Enter Issue Date: ");
			update.setIssue_Date(s.next());
			sess.save(update);
			tr.commit();
			break;
			
		case 4:
			LMS delete = new LMS();
			System.out.println("Enter Serial Number: ");
			delete = sess.load(LMS.class, s.nextInt());
			sess.delete(delete);
			tr.commit();
			break;
	}
		s.close();

}
}
