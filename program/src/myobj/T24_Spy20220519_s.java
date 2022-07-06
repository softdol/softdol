package myobj;

import java.util.HashMap;

public class T24_Spy20220519_s {

	/*
	 * 	�����̵��� ���� �ٸ� ���� �����Ͽ� �Ծ� �ڽ��� �����մϴ�.

		���� ��� �����̰� ���� ���� �Ʒ��� ���� ���� �����̰� 
		���׶� �Ȱ�, �� ��Ʈ, �Ķ��� Ƽ������ �Ծ��ٸ� 
		�������� û������ �߰��� �԰ų� ���׶� �Ȱ� ��� ���� ���۶󽺸� �����ϰų� �ؾ� �մϴ�.

		����	�̸�
		�� :	���׶� �Ȱ�, ���� ���۶�
		���� :	�Ķ��� Ƽ����
		���� :	û����
		�ѿ� :	�� ��Ʈ
		�����̰� ���� �ǻ���� ��� 2���� �迭 clothes�� �־��� �� 
		���� �ٸ� ���� ������ ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.

		���ѻ���
		clothes�� �� ���� [�ǻ��� �̸�, �ǻ��� ����]�� �̷���� �ֽ��ϴ�.
		�����̰� ���� �ǻ��� ���� 1�� �̻� 30�� �����Դϴ�.
		���� �̸��� ���� �ǻ��� �������� �ʽ��ϴ�.
		clothes�� ��� ���Ҵ� ���ڿ��� �̷���� �ֽ��ϴ�.
		��� ���ڿ��� ���̴� 1 �̻� 20 ������ �ڿ����̰� ���ĺ� �ҹ��� �Ǵ� '_' �θ� �̷���� �ֽ��ϴ�.
		�����̴� �Ϸ翡 �ּ� �� ���� �ǻ��� �Խ��ϴ�.

		����� ��
		clothes							return
		
		[["yellowhat", "headgear"], 
		["bluesunglasses", "eyewear"], 
		["green_turban", "headgear"]]	5
		
		[["crowmask", "face"], 
		["bluesunglasses", "face"], 
		["smoky_makeup", "face"]]		3
		
		
		����� �� ����
		���� #1
		
		headgear�� �ش��ϴ� �ǻ��� yellow_hat, green_turban�̰� 
		eyewear�� �ش��ϴ� �ǻ��� blue_sunglasses�̹Ƿ� �Ʒ��� ���� 5���� ������ �����մϴ�.

		1. yellow_hat
		2. blue_sunglasses
		3. green_turban
		4. yellow_hat + blue_sunglasses
		5. green_turban + blue_sunglasses
		
		���� #2
		face�� �ش��ϴ� �ǻ��� crow_mask, blue_sunglasses, smoky_makeup�̹Ƿ� 
		�Ʒ��� ���� 3���� ������ �����մϴ�.
		
		1. crow_mask
		2. blue_sunglasses
		3. smoky_makeup
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, 
				{"bluesunglasses", "eyewear"}, 
				{"green_turban", "headgear"}};
		
		System.out.println(solution(clothes));
	}
	
	public static int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hList = new HashMap<>();
        
        for(String[] s : clothes) {
        	
        	hList.put(s[1], hList.getOrDefault(s[1], 0) + 1);
        	
        }
        
        System.out.println(hList);
        for(Integer i : hList.values()) {        	
        	answer *= (i + 1);
        }        
        
        return --answer;
    }
	
}




















