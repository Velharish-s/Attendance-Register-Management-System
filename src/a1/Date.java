package a1;

public class Date {
	public static int datecheck(Welcome obj,String p) {
		if(p.length()==10){
		    int c=0;
		    for(int i=0;i<10;i++){
		        if(i==2||i==5){
		            if(!Character.isDigit(p.charAt(i))&&!Character.isLetter(p.charAt(i))){
		                c++;
		            }
		        }
		        else if(Character.isDigit(p.charAt(i))){
		            c++;
		        }
		    }
		    int p1=p.charAt(0)-'0';
		    int p2=p.charAt(1)-'0';
		    int date=p1*10+p2;
		    if(p1==0) {date=p2;}
		    int m1=p.charAt(3)-'0';
		    int m2=p.charAt(4)-'0';
		    int month=m1*10+m2;
		    int y1=p.charAt(6)-'0';
		    int y2=p.charAt(7)-'0';
		    int y3=p.charAt(8)-'0';
		    int y4=p.charAt(9)-'0';
		    int year=y4+y3*10+y2*100+y1*1000;
		    if(m1==0) {month=m2;}
		    if(c==10d&&date<=31&&month<=10&&date>=1&&month>=1&&year>=2000&&year<=2050){
		        return 1;
		    }
		}
		return 0;
	}
}
