package myobj.parkingsystem;

public class Car {
	
//	final public static CarType normal = new CarType(0, "�Ϲ�");
//	final public static CarType disabled = new CarType(1, "�����");
//	final public static CarType babyRide = new CarType(2, "���Ƶ���");
//	final public static CarType lightCard = new CarType(3, "����");
	
//	private static String[] parkState = {"�Ǻ���","��������","���Ա���"};
	final static String[] carType = {"�Ϲ�","�����","���Ƶ���","����"}; 
	
	private String number;
	private int type;
	
	public Car(String number, int type) {
		this.number = number;
		this.type = type;
	}
	
	public String getNumber() {
		return number;
	}
	
	/**
	 * 0 : �Ϲ� 1: ����� 2: ���Ƶ��� 3: ����
	 * @return
	 */
	public int getType() {
		return type;
	}
		
	public String getTypeValue() {
		return carType[type];
	}
	
//	@Override
//	public String toString() {
//		return String.format("%s - %s [%s]", carNum, carType.getName(), parkState[state] );
//	}

}
