package myobj.parking;

public class Car {
	// 장애인, 유아동승, 경차는 제외
	final public static CarType normal = new CarType(0, "일반");
	final public static CarType disabled = new CarType(1, "장애인");
	final public static CarType babyRide = new CarType(2, "유아동승");
	final public static CarType lightCard = new CarType(3, "경차");
	
	
	
	private static String[] parkState = {"판별중","주차가능","진입금지"};
	
	private String carNum;
	private CarType carType;
	private int state;
	
	public Car(String carNum, CarType carType) {
		this.carNum = carNum;
		this.carType = carType;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public CarType getCarType() {
		return carType;
	}
	
	public String getLastNum() {
		return carNum.substring(6);
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s [%s]", carNum, carType.getName(), parkState[state] );
	}
	
}
