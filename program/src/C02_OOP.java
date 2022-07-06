import java.util.Arrays;

public class C02_OOP {
	
	/*
	 * 	# 객체 지향 프로그래밍(Object Oriented Programming)
	 * 
	 * 	 - 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법론
	 * 	 - 변수와 함수를 무분별하게 사용하는 것보가 현실에 존재하는 객체 단위로
	 * 	   묶어서 표현하는 것이 개발자들의 효율을 높인다
	 * 	 - 해당 객체를 구성하는 변수를 멤버변수(Member), 필드(Field), 속성(Attribute) 등으로 부른다
	 * 	 - 해당 객체의 필드를 변화시킬 수 있는 객체 내부의 함수들을 메서드라고 부른다 
	 * 
	 * 
	 * 	ex: 사과
	 * 
	 * 	 - 사과의 변수: 크기, 색깔, 당도, 칼로리, 등급, 원산지 ...
	 * 	 - 사과의 메서드(변수를 변화시키는 것들)
	 * 		사과를 먹는다 : 크기↓ 칼로리↓ 먹은 사람의 칼로리↑
	 * 		사과를 던진다 : 사과의 크기와 경도에 알맞는 데미지를 가한다
	 * 		냉장고에 보관한다 : 사과의 유통기한이 천천히 감소한다 
	 * 		
	 *	# 클래스 (Class)
	 *
	 * 	 - 현실의 객체를 프로그래밍 언어로 표현한 문법
	 * 	 - 클래스는 해당 객체의 설계도 역할을 한다
	 * 	 - 클래스는 정의한 시점에서는 실체가 없다
	 * 	 - 클래스를 이용해 찍어내는 실제 객체를 '인스턴스(instance)'라고 부른다
	 * 	 - 클래스를 이용해 인스턴스를 생성할 떄는 new를 사용한다
	 * 	 - 모든 클래스는 참조형 변수 타입이다
	 * 
	 */
	public static void main(String[] args) {
		
		// 사과 클래스로 사과 인스턴스 생성
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		
		//.을 찍어서 해당 인스턴스의 필드값을 사용할 수 있다
		a1.size = 20;
		a1.sweet = 8;
		a1.calorie = 200.0;
		a1.color = "빨간색";
		
		for(int i = 0 ; i < 5 ; ++i) {
			a1.eat();			
		}
		
		a2.eat();
		
		System.out.println("a1의 size: " + a1.size);
		System.out.println("a1의 당도: " + a1.sweet);
		System.out.println("a1의 칼로리: " + a1.calorie);
		System.out.println();
		System.out.println("a2의 칼로리: " + a2.calorie);
		
		a1.changeColor("블랙");
		a1.info();
		a2.info();
		
		Bus b1 = new Bus();
		
		b1.chair = 30;
		b1.num = 165;
		b1.ride();
		b1.route = new String[] {"구리", "동화고", "도농역", "정약용도서관", "도농역", "동화고"};
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			b1.nextStat();		
			b1.thisStat();
			System.out.println();
		}
		
		b1.info();
		
		
		Subway sub1 = new Subway();
		Subway sub2 = new Subway();
		
		sub1.line = 1;
		sub1.current_station = 3;
		//sub1.color = 1;
		
		sub2.line = 7;
		sub2.current_station = 0;
		//sub2.color = 7;
		
		sub1.info();
		sub2.info();
		
		sub1.next();
		sub1.info();		
	}
}

class Subway {
	
	String[] SUBWAY_COLOR = {"남색", "녹색", "주황색", "하늘색", "보라색", "짙은주황색", "탁한녹색"};
	String[][] SUBWAY_MAP = {
			{"인천","동인천","도원","제물포","도화"},
			{"","","","",""},
			{"","","","",""},
			{"","","","",""},
			{"","","","",""},
			{"","","","",""},
			{"","","","",""},
			{"까치산","신대방삼거리","장승베기","상도","숭실대입구"}
			};
	
	int line;
	int current_station;
	boolean direction = true;
	//int color;
	
	
	void next() {
		// 증가하는 방향일때 맨 오른쪽 역이거나
		// 감소하는 방향일때 맨 왼쪽 역이라면 방향을 바꾼다
		if((direction && current_station + 1 == SUBWAY_MAP[line - 1].length) || (!direction && current_station == 0)) {
			direction = !direction;
		}
		
		if(direction) {
			current_station++;
		}else {
			current_station--;
		}		
	}
	
	void info() {
		System.out.println("[차량 정보]");
		System.out.println("line : " + line + "호선");
		System.out.println("색상 : " + SUBWAY_COLOR[line - 1]);
		System.out.println("현재 정차역 : " + SUBWAY_MAP[line - 1][current_station]);
	}
	
}

class Apple{
	/*
	 * 	# 인스턴스 변수
	 * 
	 * 	 - 클래스 내부에 선언한 변수
	 * 	 - 각 인스턴스마다 다른 값을 가질 수 있는 변수
	 * 	 - aka. 필드, 속성, 멤버, 상태, ....
	 */
	int size;
	int sweet;
	double calorie;
	String color;

	/*
	 * 	# 인스턴스 메서드
	 * 
	 * 	 - 클래스 내부에 선언한 함수
	 * 	 - 주로 해당 인스턴스 변수를 활용하거나 변화시키는 역할을 한다
	 * 
	 * 	# this
	 * 
	 * 	 - 현재 인스턴스 자기 자신을 가리키는 문법
	 * 	 - 생략이 가능하다
	 */
	void eat() {
		size--;
		calorie -= 5;
	}
	
	void info() {
		System.out.println(" - - - 이 사과의 정보 - - -");
		System.out.println("크기\t: " + this.size);
		System.out.println("당도\t: " + sweet);
		System.out.println("칼로리\t: " + calorie);
		System.out.println("색깔\t: " + color);		
	}
	
	
	//	필드명과 매개변수명이 동일한 이름을 가질 때 this를 사용해 반드시 구분해줘야 한다
	void changeColor(String color) {
		this.color = color;
	}
	
}


/*
 * 	연습문제: 현실에 존재하는 객체를 참고하여 클래스를 하나 생성한 후 
 * 			인스턴스를 생성하고 정보를 출력해보세요. 
 * 
 *  ※ 인스턴스 변수는 3개 이상, 인스턴스 메서드는 2개 이상, 과일 금지, 물통 금지
 */

class Bus{
	
	int num;
	int color;
	int chair;
	int thisStatNum;
	
	String[] route;
	String[] numColor = {"빨강", "초록"};
	
	Bus(){
		this(30, 1);
	}
	
	Bus(int chair, int color){
		this.chair = chair;
		this.color = color;
	}
	
		
	void ride() {
		chair--;
	}
	
	void quit() {
		chair++;
	}
	
	void info() {
		System.out.println(" - - - - "+num+"번 버스의 정보 - - - - ");
		System.out.println("앉을 수 있는 의자는 [" + chair + "개] 입니다.");
		System.out.println("차량의 번호판 색은 [" + numColor[color] + "] 입니다.");
		System.out.println("차량의 노선은 " + Arrays.toString(route) + " 입니다.");
		System.out.println("현재 버스는 [" + route[thisStatNum % route.length] + "]역에 있습니다.");
		System.out.println("- - - - - - - - - - - - - - - - ");
	}
	
	void thisStat() {
		if(route.length > 0) {
			System.out.println("현재 역은 " + route[thisStatNum % route.length] + "역 입니다.");
		}else {
			System.out.println("노선이 입력되지 않았습니다.");
		}
	}
	
	void nextStat() {
		thisStatNum++;
	}
	
}


