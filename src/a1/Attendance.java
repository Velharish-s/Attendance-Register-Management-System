package a1;
import java.util.Scanner;
import java.util.ArrayList;
class Welcome{
	public static int ss=0;
	 public  static ArrayList<String> name=new ArrayList<>();
	 public  static ArrayList<String> password=new ArrayList<>();
	 public  static ArrayList<String> joindate=new ArrayList<>();
	 public  static ArrayList<String> regno=new ArrayList<>();
	 public  static ArrayList<String> a_name=new ArrayList<>();
	 public  static ArrayList<String> a_password=new ArrayList<>();
	 public  static ArrayList<String> date=new ArrayList<>();
	 public  static ArrayList<Integer> pa_maintain=new ArrayList<>();
	 public  static ArrayList<Integer> datemaintain=new ArrayList<>();
	 public static ArrayList<Integer> status_P=new ArrayList<>();
	 public static ArrayList<Integer> status_A=new ArrayList<>();
	 public static ArrayList<String> ld=new ArrayList<>();//leave date
	 public static ArrayList<String> lr=new ArrayList<>();//leave reason
	 public static ArrayList<Integer> ar=new ArrayList<>();//approve are reject leave
	 public static ArrayList<String> nd=new ArrayList<>();//normalize date
	 public static ArrayList<String> infonormal=new ArrayList<>();//info for normalization
	 public static ArrayList<Integer> infonormal_ar=new ArrayList<>();//normalize appro or reject
	 static Scanner s1=new Scanner(System.in);
	void display(Welcome obj) {
		System.out.println("1.Student login");
		System.out.println("2.Admin login");
		
		while(true) {
		System.out.println("press respective number for login:");
		int n=s1.nextInt();
		if(n==1&&name.size()!=0) {
			System.out.println("Student login");
			s1.nextLine();
			System.out.print("Enter your name:");
			String student_name=s1.nextLine();
			System.out.print("Password:");
			String student_password=s1.nextLine();
			int p1=0;
			for(int i=0;i<name.size();i++) {
				if(student_name.equals(name.get(i))) {
						p1=i;
						break;
				}
			}
			ss=p1;
			if(!student_password.equals(password.get(p1))) {
				System.out.println("Invalid username or password");
				display(obj);
			}
			else if(student_password.equals(password.get(p1))) {
				Student.student(obj, p1);
			}
			break;
		}
		else if(n==2) {
			System.out.println("Admin login");
			//
			a_name.add("kiruba");
			a_password.add("1234");
			s1.nextLine();
			System.out.print("Enter your name:");
			String na1=s1.nextLine();
			System.out.print("Enter password:");
			String pa1=s1.nextLine();
			int p=-1;
			for(int i=0;i<a_name.size();i++) {
				if(a_name.get(i).equals(na1)) {
					p=i;
					break;
				}
			}
			if(p!=-1&&a_password.get(p).equals(pa1)) {
					    d(obj);
						//C(a,obj);
				 //
			}
			else {
				System.out.println("Invalid username or password");
				display(obj);
			}
			//
			break;
		}
		else if(name.size()==0) {
			System.out.println("No Students are signed in");
		}
		else {
			System.out.println("Invalid");
		}
		//s1.close();
		}
	}

//check
	static Scanner s2=new Scanner(System.in); 
public void C(int a,Welcome obj) {
	
	//Add_member s1=new Add_member();
	switch(a){
	case 1:
		System.out.println("Add student");
		boolean b=true;
		while(b) {
			b=false;
			s2.nextLine();
			System.out.print("Enter Name:");
			name.add(s2.nextLine());
			status_P.add(0);
			status_A.add(0);
			ld.add("");
			lr.add("");
			ar.add(-1);
			nd.add("");
			infonormal.add("");
			infonormal_ar.add(-1);
			/*System.out.print(status_P.size());
			System.out.print(status_A.size());*/
			boolean k=true;
			while(k) {
				k=false;
			System.out.print("Enter joining Date:");
			///////////////////////////////////////////////////////////////////////////
			//joindate.add(s2.nextLine());
			String d1=s2.nextLine();
			int p5=Date.datecheck(obj, d1);
			if(p5==1) {
				joindate.add(d1);
			}
			else if(p5==0) {
				System.out.println("Invalid date!");
				k=true;
			}}
			///////////////////////////////////////////////////////////////////////////
			System.out.print("Enter Regno:");
			regno.add(s2.nextLine());
			System.out.print("set your password:");
			password.add(s2.nextLine());
			int p=0;
			System.out.print("press 1 to add another member if no need press any integer:");
			p=s2.nextInt();
			s2.nextLine();
			if(p==1) {
				b=true;
			}
			else {
				d(obj);
			}
		}
		System.out.print("press 0 to go back or 1 to go front page:");
		int m=s2.nextInt();
		if(m==0) {
			d(obj);
		}
		if(m==1) {
			obj.display(obj);
		}
		//
		break;
	case 2:
		 boolean s=true;
		while(s) {
			s=false;
		System.out.println("Add admin");
		s2.nextLine();
		System.out.print("Enter name:");
		a_name.add(s2.nextLine());
		System.out.print("set your Password:");
		a_password.add(s2.nextLine());
		int p=0;
		System.out.print("press 1 to add another member if no need press any integer:");
		p=s2.nextInt();
		s2.nextLine();
		if(p==1) {
			s=true;
		}
		else {
			obj.display(obj);
		}
		}
		System.out.print("press 0 to go back or press any integer to login page:");
		int m1=s2.nextInt();
		if(m1==0) {
			d(obj);
		}
		else{
			obj.display(obj);
		}
		
		//
		break;
	case 3:
		System.out.println("Remove a student");
		if(name.size()!=0) {
		boolean c=true;
		while(c) {
			c=false;
			System.out.print("Enter Regno:");
			String a1=s2.nextLine();
			System.out.print("Enter name:");
			String a2=s2.nextLine();
			for(int i=0;i<name.size();i++) {
				if(name.get(i).equals(a2)) {
					name.remove(i);
				}
			}
			for(int i=0;i<regno.size();i++) {
				if(regno.get(i).equals(a1)) {
					regno.remove(i);
				}
			}
			System.out.println("Removed successfully");
			int p5=0;
			System.out.print("press 1 to add another member if no need press any integer:");
			p5=s2.nextInt();
			s2.nextLine();
			if(p5==1) {
				c=true;
			}
			else {
				d(obj);
			}
		}
		System.out.print("press 0 to go back or press any integeer to go login page:");
		int m2=s2.nextInt();
		if(m2==0) {
			d(obj);
		}
		else {
			obj.display(obj);
		}}
		//
		d(obj);
		break;
	case 4:
		System.out.println("remove admin");
		if(a_name.size()>2) {
		boolean h=true;
		while(h) {
			h=false;
			System.out.print("Enter name:");
			String a22=s2.nextLine();
			for(int i=0;i<a_name.size();i++) {
				if(a_name.get(i).equals(a22)) {
					a_name.remove(i);
					a_password.remove(i);
				}
			}
			System.out.println("Removed successfully");
			int p1=0;
			System.out.print("press 1 to add another member if no need press any integer:");
			p1=s2.nextInt();
			s2.nextLine();
			if(p1==1) {
				h=true;
			}
			else {
				obj.display(obj);
			}
			}
			System.out.print("press 0 to go back or press any integer to login page:");
			int m3=s2.nextInt();
			if(m3==0) {
				d(obj);
			}
			else {
				obj.display(obj);
			}}
		//
		d(obj);
		break;
	case 5:
		System.out.println("update attendance");
		//Check.v(obj);
		//
		boolean g=true;
		while(g) {
			g=false;
			s2.nextLine();
		System.out.print("Enter Name:");
		String n=s2.nextLine();
		if(name.size()!=0) {
		for(int i=0;i<name.size();i++) {
			if(n.equals(name.get(i))) {
				System.out.print("Enter Regno:");
				String r=s2.nextLine();
				if(r.equals(regno.get(i))) {
//					System.out.print("Enter Date:");
//					date.add(o6.nextLine());
					boolean k=true;
					while(k) {
						k=false;
					System.out.print("Enter date:");
					///////////////////////////////////////////////////////////////////////////
					//joindate.add(s2.nextLine());
					String d1=s2.nextLine();
					int p5=Date.datecheck(obj, d1);
					if(p5==1) {
						date.add(d1);
						int g5=0;
						for(int i3=0;i3<name.size();i3++) {
							if(name.get(i3).equals(n)) {
								g5=i;
								break;
							}
						}
						datemaintain.add(g5);
					}
					else {
						System.out.println("Invalid date!");
						k=true;
					}}
				///////////////////////////////////////////////////////////////////////////	
					//
					System.out.print("present or absent (small lettes only allowed)");
					String sta=s2.nextLine();
					if(sta.equals("present")) {
						int p1=status_P.get(i)+1;
						status_P.set(i,p1);
						pa_maintain.add(1);
					}
					if(sta.equals("absent")) {
						int p1=status_A.get(i)+1;
						status_A.set(i,p1);
						pa_maintain.add(0);
					}
				}
			}
			System.out.println("Enter 1 to add more attendance:");
			int k=s2.nextInt();
			if(k==1) {
				g=true;
			}
			else {
				g=false;
				d(obj);
			}
			}
		}
		else {
			System.out.println("There is no student signed in!");
			d(obj);
		}
		}
		//
		break;
	case 6://view attendance is common so it is end with login page
		if(name.size()!=0) {
			s2.nextLine();
		System.out.println("View Attendance");
		System.out.print("Enter Name:");
		int p=-1;
		String aa=s2.nextLine();
		for(int i=0;i<name.size();i++) {
			if(aa.equals(name.get(i))) {
				p=i;
				break;
			}
		}
		if(p!=-1) {
			//ViewAttendance.attenview(p,obj);
			//
			System.out.println("1.View Atendance Summary");
			System.out.println("2.View Detailed Attendance");
			int sd=s2.nextInt();
			if(sd==1) {
				System.out.println("Name: "+name.get(p)+" RegNo: "+regno.get(p)+" Total: "+(status_P.get(p)+status_A.get(p))+" Present: "+status_P.get(p)+" Absent: "+status_A.get(p));
				System.out.println();
				d(obj);
			}
			else if(sd==2&&date.size()>0&&(status_P.get(p)+status_A.get(p))>0) {
				System.out.println("Detailed summary");
				System.out.println();
				System.out.println("Name: "+name.get(p)+" Registor No: "+regno.get(p));
				System.out.println("Total: "+(status_P.get(p)+status_A.get(p))+" Present: "+status_P.get(p)+" Absent: "+status_A.get(p));
				System.out.println();
				System.out.println("DATE:\t\tATTENDANCE");
				for(int i=0;i<datemaintain.size();i++) {
					if(datemaintain.get(i)==p) {
						System.out.print(date.get(i));
						if(pa_maintain.get(i)==1) {
							System.out.println("\t Present");
						}
						else {
							System.out.println("\t Absent");
						}
					}
				}
				
				d(obj);
			}
			else {
				System.out.println("There is no data to give ");
				d(obj);
			}
			//
		}
		else {
			System.out.println("Invalid name");
			d(obj);
		}}
		else {
			System.out.println("NILL!!!");
			d(obj);
		}
		//im here....................................................
		break;
	case 7:
		System.out.println("Process Normalise Requist");
		//Per.normalize_per1(obj, ss);
		//
		int y=0;
		for(int i=0;i<nd.size();i++) {
			if(!nd.get(i).equals("")){
				if(!infonormal.get(i).equals("")) {
					y=1;
					System.out.println("Name: "+name.get(i));
					System.out.println("RegNO: "+regno.get(i));
					System.out.println("Date: "+nd.get(i));
					System.out.println("Reason: "+infonormal.get(i));
					infonormal.set(i,"");
					boolean s5=true;
					while(s5) {
						s5=false;
						System.out.println("Enter 1 to Approve (0 to Reject)");
				    	int p5=s2.nextInt();
				    	if(p5==1) {//7.18 pm happen change
				    		int a8=status_P.get(ss)+1;
				    		status_P.set(ss,a8);
				    		int a1=status_A.get(ss)-1;
				    		status_A.set(ss,a1);
				    		//
				    		for(int i1=0;i1<date.size();i1++) {
				    			if(date.get(i1).equals(nd.get(i)))
				    			pa_maintain.set(i1,1);
				    		}
				    		infonormal_ar.set(i,1);
				    		break;
				    	}
				    	else if(p5==0) {
				    		infonormal_ar.set(i,0);
				    		break;
				    	}
				    	else {
				    		System.out.println("Invalid");
				    		s5=true;
				    	}
				    }
				}
			}
			else{
				System.out.println("Request Not Found");
				System.out.println();
			}
		}
		if(y==0) {
			System.out.println("No Request Found");
			System.out.println();
		}
		d(obj);
		//
		break;
	case 8:
		System.out.println("Approve/Reject Leave");
		//Per.leave_per(obj, ss);
		//
		int u=0;
		for(int i=0;i<lr.size();i++) {
			if(!lr.get(i).equals("")) {
				u=1;
				System.out.println("Name: "+name.get(i));
				System.out.println("regno: "+regno.get(i));
				System.out.println("Date: "+ld.get(i));
				System.out.println("Reason: "+lr.get(i));
				boolean s5=true;
				while(s5) {
					s5=false;
					System.out.println("Enter 1 to Approve (0 for reject)");
					int gh=s2.nextInt();
					if(gh==1) {
						ar.set(i,1);
						break;
					}
					else if(gh==0) {
						ar.set(i,0);
						break;
					}
					else {
						System.out.println("Invalid");
						s5=true;
					}
				}
			}
		}
		if(u==0) {
			System.out.println("No request found");
			System.out.println();
			d(obj);
		}
		d(obj);
		//
		break;
	default:
		System.out.println("Invalid");
		obj.display(obj);
	}
	//s2.close();
}
//check

//admin
public  void d(Welcome obj) {
	s2.nextLine();
	System.out.println("Home page ->press any integer rather than below mentioned number:");
	System.out.println("1.Add a student");
	System.out.println("2.Add a Admin");
	System.out.println("3.Remove a student");
	System.out.println("4.remove a Admin");
	System.out.println("5.Update Attendance");
	System.out.println("6.View Attendance");
	System.out.println("7.Process Normalise Requist");
	System.out.println("8.Approve/Reject Leave");
	System.out.println("Enter respective number to continue.. ");
	 int a=s2.nextInt();
	C(a,obj);
}
//admin
}
public class Attendance {
	public static void main(String arr[]) {
		Welcome a1=new Welcome();
		a1.display(a1);
	}
}
