package myobj;

public class StudentTime extends Time {

	@Override
	public void viewTime() {
		System.out.println("���� ["+name+"]�ð��� "+ ( hour + 4 )+"�� "+minute+"�� "+seconds+"�� �Դϴ�.");
	}
	
	@Override
	public void plusHour(int hour) {		
		this.minute += hour * 30;
		this.hour += minute / 60;
		this.minute = minute % 60;
		
	}
}
