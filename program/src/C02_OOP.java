import java.util.Arrays;

public class C02_OOP {
	
	/*
	 * 	# ��ü ���� ���α׷���(Object Oriented Programming)
	 * 
	 * 	 - ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	 * 	 - ������ �Լ��� ���к��ϰ� ����ϴ� �ͺ��� ���ǿ� �����ϴ� ��ü ������
	 * 	   ��� ǥ���ϴ� ���� �����ڵ��� ȿ���� ���δ�
	 * 	 - �ش� ��ü�� �����ϴ� ������ �������(Member), �ʵ�(Field), �Ӽ�(Attribute) ������ �θ���
	 * 	 - �ش� ��ü�� �ʵ带 ��ȭ��ų �� �ִ� ��ü ������ �Լ����� �޼����� �θ��� 
	 * 
	 * 
	 * 	ex: ���
	 * 
	 * 	 - ����� ����: ũ��, ����, �絵, Į�θ�, ���, ������ ...
	 * 	 - ����� �޼���(������ ��ȭ��Ű�� �͵�)
	 * 		����� �Դ´� : ũ��� Į�θ��� ���� ����� Į�θ���
	 * 		����� ������ : ����� ũ��� �浵�� �˸´� �������� ���Ѵ�
	 * 		����� �����Ѵ� : ����� ��������� õõ�� �����Ѵ� 
	 * 		
	 *	# Ŭ���� (Class)
	 *
	 * 	 - ������ ��ü�� ���α׷��� ���� ǥ���� ����
	 * 	 - Ŭ������ �ش� ��ü�� ���赵 ������ �Ѵ�
	 * 	 - Ŭ������ ������ ���������� ��ü�� ����
	 * 	 - Ŭ������ �̿��� ���� ���� ��ü�� '�ν��Ͻ�(instance)'��� �θ���
	 * 	 - Ŭ������ �̿��� �ν��Ͻ��� ������ ���� new�� ����Ѵ�
	 * 	 - ��� Ŭ������ ������ ���� Ÿ���̴�
	 * 
	 */
	public static void main(String[] args) {
		
		// ��� Ŭ������ ��� �ν��Ͻ� ����
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		
		//.�� �� �ش� �ν��Ͻ��� �ʵ尪�� ����� �� �ִ�
		a1.size = 20;
		a1.sweet = 8;
		a1.calorie = 200.0;
		a1.color = "������";
		
		for(int i = 0 ; i < 5 ; ++i) {
			a1.eat();			
		}
		
		a2.eat();
		
		System.out.println("a1�� size: " + a1.size);
		System.out.println("a1�� �絵: " + a1.sweet);
		System.out.println("a1�� Į�θ�: " + a1.calorie);
		System.out.println();
		System.out.println("a2�� Į�θ�: " + a2.calorie);
		
		a1.changeColor("��");
		a1.info();
		a2.info();
		
		Bus b1 = new Bus();
		
		b1.chair = 30;
		b1.num = 165;
		b1.ride();
		b1.route = new String[] {"����", "��ȭ��", "����", "����뵵����", "����", "��ȭ��"};
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
	
	String[] SUBWAY_COLOR = {"����", "���", "��Ȳ��", "�ϴû�", "�����", "£����Ȳ��", "Ź�ѳ��"};
	String[][] SUBWAY_MAP = {
			{"��õ","����õ","����","������","��ȭ"},
			{"","","","",""},
			{"","","","",""},
			{"","","","",""},
			{"","","","",""},
			{"","","","",""},
			{"","","","",""},
			{"��ġ��","�Ŵ���Ÿ�","��º���","��","���Ǵ��Ա�"}
			};
	
	int line;
	int current_station;
	boolean direction = true;
	//int color;
	
	
	void next() {
		// �����ϴ� �����϶� �� ������ ���̰ų�
		// �����ϴ� �����϶� �� ���� ���̶�� ������ �ٲ۴�
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
		System.out.println("[���� ����]");
		System.out.println("line : " + line + "ȣ��");
		System.out.println("���� : " + SUBWAY_COLOR[line - 1]);
		System.out.println("���� ������ : " + SUBWAY_MAP[line - 1][current_station]);
	}
	
}

class Apple{
	/*
	 * 	# �ν��Ͻ� ����
	 * 
	 * 	 - Ŭ���� ���ο� ������ ����
	 * 	 - �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
	 * 	 - aka. �ʵ�, �Ӽ�, ���, ����, ....
	 */
	int size;
	int sweet;
	double calorie;
	String color;

	/*
	 * 	# �ν��Ͻ� �޼���
	 * 
	 * 	 - Ŭ���� ���ο� ������ �Լ�
	 * 	 - �ַ� �ش� �ν��Ͻ� ������ Ȱ���ϰų� ��ȭ��Ű�� ������ �Ѵ�
	 * 
	 * 	# this
	 * 
	 * 	 - ���� �ν��Ͻ� �ڱ� �ڽ��� ����Ű�� ����
	 * 	 - ������ �����ϴ�
	 */
	void eat() {
		size--;
		calorie -= 5;
	}
	
	void info() {
		System.out.println(" - - - �� ����� ���� - - -");
		System.out.println("ũ��\t: " + this.size);
		System.out.println("�絵\t: " + sweet);
		System.out.println("Į�θ�\t: " + calorie);
		System.out.println("����\t: " + color);		
	}
	
	
	//	�ʵ��� �Ű��������� ������ �̸��� ���� �� this�� ����� �ݵ�� ��������� �Ѵ�
	void changeColor(String color) {
		this.color = color;
	}
	
}


/*
 * 	��������: ���ǿ� �����ϴ� ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� 
 * 			�ν��Ͻ��� �����ϰ� ������ ����غ�����. 
 * 
 *  �� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼���� 2�� �̻�, ���� ����, ���� ����
 */

class Bus{
	
	int num;
	int color;
	int chair;
	int thisStatNum;
	
	String[] route;
	String[] numColor = {"����", "�ʷ�"};
	
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
		System.out.println(" - - - - "+num+"�� ������ ���� - - - - ");
		System.out.println("���� �� �ִ� ���ڴ� [" + chair + "��] �Դϴ�.");
		System.out.println("������ ��ȣ�� ���� [" + numColor[color] + "] �Դϴ�.");
		System.out.println("������ �뼱�� " + Arrays.toString(route) + " �Դϴ�.");
		System.out.println("���� ������ [" + route[thisStatNum % route.length] + "]���� �ֽ��ϴ�.");
		System.out.println("- - - - - - - - - - - - - - - - ");
	}
	
	void thisStat() {
		if(route.length > 0) {
			System.out.println("���� ���� " + route[thisStatNum % route.length] + "�� �Դϴ�.");
		}else {
			System.out.println("�뼱�� �Էµ��� �ʾҽ��ϴ�.");
		}
	}
	
	void nextStat() {
		thisStatNum++;
	}
	
}


