import java.util.ArrayList;

public class D05_Generic {
	
	/*
	 * 	# Generic
	 * 
	 * 	 - Ŭ���� ���� �ڿ��� Ÿ���� �ܺο��� ���߿� ������ �� �ְ� �ϴ� ����
	 * 	 - ���׸����� �⺻ Ÿ���� ����� �� ���� ������ Wrapper Ŭ������ ����ؾ� �Ѵ�
	 * 
	 * 	# static Generic
	 * 
	 * 	 - ����ƽ �޼��忡 ���׸��� ����� ���� ����Ÿ�� �տ� ���׸��� �߰����ش�
	 * 
	 */
	
	public static void main(String[] args) {
	
		GenericTest<String, Integer, Double> test = new GenericTest();
		
		// static ���׸� �޼��� ����ϱ�
		GenericTest.<Apple>staticMethod1();
		
	}

}

class GenericTest<AType, BType, CType> {
	
	AType var1;
	AType var2;
	BType var3;
	CType var4;
	
	public AType method1() {
		return null;
	}
	
	
	static <MyType> int staticMethod1() {
		ArrayList<MyType> list = new ArrayList<>();
		
		//Mytype a = list.get(0);
		// ���׸� A, B, C�� �ν��Ͻ� ������ �������� ������ static �޼��忡���� ����� �� ����
		//A v1 = null;
		
		//MyType some = new MyType();
		
		return 0;
	}
	
}












