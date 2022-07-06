
public class C04_Static {
	
	/*
	 * 	# static (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����
	 * 
	 * 	 - ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� ������ ���� �����̶�� �Ѵ�
	 * 	 - �տ� static�� ���� �ڿ�(�ʵ�,�޼���)�� ��� �ν��Ͻ��� �������� ����ϴ� �ڿ��� �ȴ�
	 * 	 - static ������ �ڿ��� �ƹ��� �ν��Ͻ��� ���Ƶ� Ŭ������ �ϳ��̱� ������
	 * 	   Ŭ���� �̸��� .�� ��� ����� �� �ִ�
	 * 	 - static ������ �ڿ��� �ν��Ͻ��� ����� ������ ����� �� �ִ�
	 * 	 - static �޼���� �ν��Ͻ��� ����� ������ ���� �� �ֱ� ������
	 * 	   �ν��Ͻ� ������ ����� �� ����
	 * 	 - static �ʵ常 ����ϴ� �޼���� static �޼���� ����� ���� ����
	 * 	 - �ν��Ͻ� ������ Ȱ���ϴ� �޼���� �ݵ�� �ν��ͽ� �޼������� �Ѵ�
	 * 
	 */
	
	public static void main(String[] args) {
		
//		PalyingCard.chagesSize(0, 0);
		
		PalyingCard h1 = new PalyingCard(0,1);
		PalyingCard s1 = new PalyingCard(1,1);
		PalyingCard d10 = new PalyingCard(1,10);
		
		d10.width = 10;
		
		for(int i =0 ; i < 5; i++) {
//			PalyingCard.width++;
//			h1.print();
//			s1.print();
//			d10.print();
		}
		
		
//		System.out.println(h1.width);
//		System.out.println(s1.width);
//		System.out.println(d10.width);
		
		ButcherShop b1 = new ButcherShop();
		ButcherShop b2 = new ButcherShop(400,2);
		ButcherShop b3 = new ButcherShop(50000,1);
		
		b1.print();
		System.out.println();
		b2.print();
		System.out.println();
		b3.print();
		System.out.println();		
		
		b2.discountRate = 0.2;
		b2.print();
		System.out.println();
		
		b2.type = 3;
		b2.print();
		System.out.println();
		
	}

}
class SolidR4{
	
	// Ŭ���� ����, ���� ����
	static int price = 8000;
	static int drift = 90;
	static int acc = 49;
	static int cornering = 556;
	static int boosttime = 440;
	static int boostCharge = 200;
	static String category = "���ǵ� īƮ / �Ϲ�";
	static String description = "�ָ��� �ø����� �������� ���̽��� �ٵ��Դϴ�."
			+ "\nG3���� ����ȭ�� �ٵ������ R4�� ������ ū ��ȭ�� �ϰ� �˴ϴ�.";
	
	static String[] colorNames = {"������","�����","�ʷϻ�","�Ķ���","������","���","��ũ��"};
	
	// �ν��Ͻ� ����
	String wheel;
	String handle;
	String kit;
	String enginPatch;
	String owner;
	int paint;
	
}

//��������: static �ڿ��� ������ Ŭ������ �ϳ� �����غ�����.
class ButcherShop{
	static String[] meatType = {"����", "��", "��"};
	static double[] meatPrice = {1.2, 1.5, 1.0};
	static int gramPerWon = 10;
	
	
	double weight;	
	int type;
	double discountRate;
	double price;
	
	ButcherShop(){
		this(100, 1);
	}
	
	ButcherShop(int weight, int type){
		this.weight = weight;
		this.type = type;
		discountRate = 0.0;		
	}
	
	ButcherShop(int weight, int type, int discountRate){
		this.weight = weight;
		this.type = type;
		this.discountRate = discountRate;
	}
	
	public void print() {
		if(type >= meatType.length) {
			System.out.println(">> ��� ������ �����ϴ�.");
			return;
		}
		System.out.println("----------------��� ����-----------------");
		System.out.println("��� ���� : " + meatType[type]);
		System.out.println("��� ���� : " + weight + "g");
		System.out.println("��� ���� : " + weight * meatPrice[type] * gramPerWon + "�� (100g ���� : "+ 100 * gramPerWon * meatPrice[type]  +"��)");
		if(discountRate > 0) {
			System.out.println("�����ε� ���� : " + price() + "�� (������ : "+ 100 * discountRate +"%)");
		}
	}
	
	public double price() {
		
		price = weight * meatPrice[type] * gramPerWon;
		price = discountRate == 0 ?  price : price - discountRate * price;
		
		return price;
	}
	
}

class PalyingCard{
	// ��� �ν��Ͻ��� �Բ� ����� ��
	static int width = 100;
	static int height = 200;
	
	char[] suits = {'��', '��','��','��'};
	
	// �� �ν��Ͻ��� �ڱ⸸�� ������ ������ ����� �� (�ν��Ͻ� ����)
	int suit;
	int num;
	
	public static void chagesSize(int width, int height) {
		// this�� �ν��Ͻ��� ������ �� �ڱ� �ڽ��� �ǹ� �ϹǷ�, static �޼��忡���� ����� �� ����
		PalyingCard.width = width;
		PalyingCard.height = height;
		
		System.out.println("�ٲ� �ʺ�: " + PalyingCard.width);
		System.out.println("�ٲ� ����: " + PalyingCard.height);
		//���� ����
		//System.out.println("���� ī���� ����: " + suits[suit]);
	}
	
	public PalyingCard(int suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public void print() {
		System.out.print("��������");
		for(int i= 0; i < width; i++) {
			System.out.print("��");
		}
		System.out.println("��������");
		System.out.printf("�� %c%3d ", suits[suit], num);
		for(int i= 0; i < width; i++) {
			System.out.print(" ");
		}
		System.out.print("��\n");
		System.out.print("��������");
		for(int i= 0; i < width; i++) {
			System.out.print("��");
		}
		System.out.println("��������");
	}
}
