package myobj.school;

public interface DefaultRandom {	
	
	final static String[] GROUP_NAME = {"���α׷���", "��Ʈ��ũ", "�ӽŷ���"};
	final static String[] FIRST_NAME = {"��","��","��","��","ȫ","��","��","Ȳ","��","��"};
	final static String[] LAST_NAME = {"ö��","�浿","����","��ȣ","��ȣ","�μ�","����","����","����","�߼�"};
	
	
	int koreanScore = (int)(Math.random() * 101 + 1);
	int englishScore = (int)(Math.random() * 101 + 1);
	int mathScore = (int)(Math.random() * 101 + 1);
	int programmingScore = (int)(Math.random() * 101 + 1);
	int datastructureScore = (int)(Math.random() * 101 + 1);
	int osSocre = (int)(Math.random() * 101 + 1);
	
}
