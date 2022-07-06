package myobj.rps;

public class Shape {
	
	final public static Shape ROCK = new Shape(0);
	final public static Shape SCISSORS = new Shape(1);
	final public static Shape PAPPER = new Shape(2);
	
	final public static Shape[] shapes = {ROCK, SCISSORS, PAPPER};
	final public static String[] name = {"바위","가위","보"};
	

//	final public static int ROCK = 0;
//	final public static int SCISSORS = 1;
//	final public static int PAPER = 2;
	
	final private static String[] names = {"바위", "가위", "보"};
	
	private int shape;
	
	private Shape(int shape) {
		this.shape = shape;		
	}
	
	public static Shape random() {
		return shapes[(int)(Math.random() * shapes.length)];
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return 왼쪽이 이기면 1, 오른쪽이 이기면 -1, 비기면 0을 리턴합니다.
	 */
	public static int versus(Shape a, Shape b) {
		int left = a.getValue();
		int right = b.getValue();
		
		// 바위0 가위1 보2
		if(left == right) {
			return 0;
		}else if((left + 1) % 3 == right) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public int getValue() {
		return shape;
	}
	
	public String getName() {
		return names[shape];
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
