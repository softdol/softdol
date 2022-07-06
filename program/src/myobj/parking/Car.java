package myobj.parking;

public class Car {
	// �����, ���Ƶ���, ������ ����
	final public static CarType normal = new CarType(0, "�Ϲ�");
	final public static CarType disabled = new CarType(1, "�����");
	final public static CarType babyRide = new CarType(2, "���Ƶ���");
	final public static CarType lightCard = new CarType(3, "����");
	
	
	
	private static String[] parkState = {"�Ǻ���","��������","���Ա���"};
	
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
