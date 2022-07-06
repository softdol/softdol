package myobj;

public class GameTime extends Time {
	
	public void viewDef() {
		super.viewTime();
	}
	
	@Override
	public void viewTime() {
		System.out.println("���� ["+name+"]�ð��� "+ hour +"�� "+minute+"�� "+seconds+"�� �Դϴ�.");
	}
	
	@Override
	public void plusHour(int hour) {		
		System.out.println(name +"�� "+hour+"�ð��� ���� ���� �ð��� "+ (this.hour + hour) +"�� ��� �����մϴ�.");
		System.out.print("������, ");
		
		this.hour += hour * 2;
		
		viewTime();
	}

}
