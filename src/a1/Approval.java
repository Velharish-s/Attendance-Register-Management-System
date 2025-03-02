package a1;
import java.util.Scanner;
public class Approval extends Welcome{
	static Scanner a3=new Scanner(System.in);
	public static void leaveinfo(Welcome obj,int s) {
		if(!lr.get(s).equals("")) {
			if(!ld.get(s).equals("")) {
				System.out.println("regno: "+regno.get(s));
				System.out.println("Date: "+ld.get(s));
				System.out.println("Reason: "+lr.get(s));
				if(ar.get(s)==1) {
					System.out.println("Leave Approve");
					lr.set(s,"");
					ld.set(s,"");
					ar.set(s,-1);
				}
				else {
					System.out.println("Leave Rejected");
					lr.set(s,"");
					ld.set(s,"");
					ar.set(s,-1);
				}
				System.out.println();
				Student.student(obj, s);
			}
		}
		else {
			System.out.println("There is no leave request raised");
			Student.student(obj, s);
		}
	}

	public static void normalize_per2(Welcome obj,int s) {//for student normalize approval check
			if(!nd.get(s).equals("")&&infonormal_ar.get(s)!=-1) {
				if(!infonormal.get(s).equals("")) {
					System.out.println("Regno: "+regno.get(s));
					System.out.println("Date: "+nd.get(s));
					//System.out.println("Reason: "+infonormal.get(s));
					infonormal.set(s,"");
					nd.set(s,"");
					if(infonormal_ar.get(s)==1) {
						//normalize
						int s6=status_P.get(s)+1;
						status_P.set(s,s6);
						int s7=status_A.get(s)-1;
						status_A.set(s,s7);
						System.out.println("Approved");
						//7.52 pm changed
						infonormal_ar.set(s,-1);
						//
					}
					else if(infonormal_ar.get(s)==-1) {
						System.out.println("No Request Here");
					}
					else {
						System.out.println("Rejected");
					}
				}
			}
			else {
				System.out.println("no request are arraised");
			}
			Student.student(obj, s);
	}
}
