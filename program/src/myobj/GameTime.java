package myobj;

public class GameTime extends Time {
	
	public void viewDef() {
		super.viewTime();
	}
	
	@Override
	public void viewTime() {
		System.out.println("현재 ["+name+"]시간은 "+ hour +"시 "+minute+"분 "+seconds+"초 입니다.");
	}
	
	@Override
	public void plusHour(int hour) {		
		System.out.println(name +"은 "+hour+"시간이 지나 현재 시간을 "+ (this.hour + hour) +"시 라고 생각합니다.");
		System.out.print("하지만, ");
		
		this.hour += hour * 2;
		
		viewTime();
	}

}
