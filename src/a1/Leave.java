package a1;
import java.util.Scanner;
//for get reasons for leave and normalize 
public class Leave extends Welcome{
	static Scanner a5=new Scanner(System.in);
	public static void check(Welcome obj,int s) {
		boolean k=true;
		while(k) {
			k=false;
			System.out.print("Enter Date:");
			String d1=a5.nextLine();
			int p5=Date.datecheck(obj, d1);
			if(p5==1) {
				ld.set(s,d1);
			}
			else {
				System.out.println("Invalid date!");
				k=true;
			}
		}
		//
		System.out.print("Reason for Leave:");
		lr.set(s,a5.nextLine());
		Student.student(obj, s);
		
	}
	public static void normal(Welcome obj,int s) {
		//a5.nextLine();
//		System.out.print("Date:");
//		nd.set(s,a5.nextLine());
		//
		boolean k=true;
		while(k) {
			k=false;
			System.out.print("Enter Date:");
			String d1=a5.nextLine();
			int p5=Date.datecheck(obj, d1);
			if(p5==1) {
				int pa=0;
				for(int i=0;i<date.size();i++) {
					if(date.get(i).equals(d1)) {
						pa=1;
						nd.set(s,d1);}
				}
				if(pa==0) {
					System.out.println("Invalid Date!");
					normal(obj,s);
				}
			}
			else {
				System.out.println("Invalid date!");
				k=true;
			}
		}
		//
		System.out.print("Info to Normalise:");
		infonormal.set(s,a5.nextLine());
		Student.student(obj, s);
	}
}
