package a1;

import java.util.Scanner;

public class Student extends Welcome {
	static Scanner s1 = new Scanner(System.in);
	public static void student(Welcome obj, int ss) {
		System.out.println("Home page ->press Zero");
		System.out.println("1.View Attendence");
		System.out.println("2.Apply Leave");
		System.out.println("3.Normalise Attendance Request");
		System.out.println("4.Applyed leave status:");
		System.out.println("5.Normalise Attendance status");
		System.out.println("print respective number to continue:");
		int a1 = s1.nextInt();
		if (a1 == 0) {
			obj.display(obj);
		} 
		else if (a1 == 1) {
			// student view summary
			ViewAttendance.attenview(ss, obj);
		} 
		else if (a1 == 2 && date.size() != 0) {
			System.out.println("Aplly Leave");
			Leave.check(obj, ss);
		} 
		else if (a1 == 3 && date.size() != 0) {
			System.out.println("Normalise Attendance Request");
			Leave.normal(obj, ss);
		} 
		else if (a1 == 4) {
			System.out.println("leave status");
			Approval.leaveinfo(obj, ss);
		} 
		else if (a1 == 5) {
			System.out.println("Normalise status");
			Approval.normalize_per2(obj, ss);
		} 
		else {
			System.out.println("Invalid");
			student(obj, ss);
		}
	}
}
