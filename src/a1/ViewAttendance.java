package a1;
import java.util.Scanner;
public class ViewAttendance extends Welcome{
	static Scanner o9=new Scanner(System.in);
		public static void attenview(int f,Welcome obj) {
			System.out.println("1.View Atendance Summary");
			System.out.println("2.View Detailed Attendance");
			int sd=o9.nextInt();
			if(sd==1) {
				System.out.println("Name: "+name.get(f)+" RegNo: "+regno.get(f)+" Total: "+(status_P.get(f)+status_A.get(f))+" Present: "+status_P.get(f)+" Absent: "+status_A.get(f));
				System.out.println();
				//obj.display(obj);
				Student.student(obj,f);
			}
			else if(sd==2&&date.size()>0&&(status_P.get(f)+status_A.get(f))>0) {
				System.out.println("Detailed summary");
				System.out.println();
				System.out.println("Name: "+name.get(f)+" Registor No: "+regno.get(f));
				System.out.println("Total: "+(status_P.get(f)+status_A.get(f))+" Present: "+status_P.get(f)+" Absent: "+status_A.get(f));
				System.out.println();
				System.out.println("DATE:\t\tATTENDANCE");
				for(int i=0;i<datemaintain.size();i++) {
					if(datemaintain.get(i)==f) {
						System.out.print(date.get(i));
						if(pa_maintain.get(i)==1) {
							System.out.println("\t Present");
						}
						else {
							System.out.println("\t Absent");
						}
					}
				}
				
				Student.student(obj,f);
			}
			else {
				System.out.println("There is no data to give ");
				Student.student(obj,f);
			}	
			//o9.close();
		}
}
