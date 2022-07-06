package myobj;

public class StudentTime extends Time {

	@Override
	public void viewTime() {
		System.out.println("현재 ["+name+"]시간은 "+ ( hour + 4 )+"시 "+minute+"분 "+seconds+"초 입니다.");
	}
	
	@Override
	public void plusHour(int hour) {		
		this.minute += hour * 30;
		this.hour += minute / 60;
		this.minute = minute % 60;
		
	}
}
