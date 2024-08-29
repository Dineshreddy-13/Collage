package exp4;

public class Time {
	public int hours,minutes,seconds;
	
	Time(){
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	Time(int h, int m, int s){
		hours = h;

		minutes = m;
		seconds = s;
	}
	
	public void displayTime() {
		System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
	}
	
	public static Time addTime(Time a,Time b) {
		int h = (a.hours + b.hours > 12)? (a.hours + b.hours)%12: a.hours + b.hours;
		int m = a.minutes + b.minutes;
			 if (m > 60) {
				 m %= 60;
				 h++;
		}
		int s = a.seconds + b.seconds;
				 if (m > 60) {
					 m %= 60;
					 m++;
			}
			 return new Time(h,m,s);
	}
	

	
	public static void main(String args[]) {
		Time t1 = new Time(11,50,3);
		Time t2 = new Time(7,50,4);
		Time t3 = addTime(t1, t2);
		t3.displayTime();
	}
}
