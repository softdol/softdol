package myobj.school;

public interface DefaultRandom {	
	
	final static String[] GROUP_NAME = {"ÇÁ·Î±×·¡¹Ö", "³×Æ®¿öÅ©", "¸Ó½Å·¯´×"};
	final static String[] FIRST_NAME = {"±è","ÀÌ","¹Ú","Çã","È«","¿Õ","°û","È²","À±","Àå"};
	final static String[] LAST_NAME = {"Ã¶¼ö","±æµ¿","¿µ¼ö","¼ºÈ£","Á¤È£","¹Î¼ö","ÁöÈÆ","¿¹ÁØ","±¤¼ö","Áß¼ö"};
	
	
	int koreanScore = (int)(Math.random() * 101 + 1);
	int englishScore = (int)(Math.random() * 101 + 1);
	int mathScore = (int)(Math.random() * 101 + 1);
	int programmingScore = (int)(Math.random() * 101 + 1);
	int datastructureScore = (int)(Math.random() * 101 + 1);
	int osSocre = (int)(Math.random() * 101 + 1);
	
}
