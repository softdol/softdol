package myobj;

public class T01_Skill20220509_s {
	public static void main(String[] args) {
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		System.out.println(solution(skill,skill_trees));
		
//		int answer = 0;
//		// ArrayList ���ڿ��� ��ųƮ�� ���ڹ迭 �ֱ�
//        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
//
//        // Iterator�� �ڹ��� �÷��� �����ӿ����� �÷��ǿ� ����Ǿ� �ִ� ��ҵ��� �о���� �����
//        // ǥ��ȭ �Ͽ��µ� �� �� �ϳ��� Iterator�̴�.
//
//        Iterator<String> it = skillTrees.iterator();
//
//        while (it.hasNext()) {
//            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
//                it.remove();
//            }
//        }
//        answer = skillTrees.size();
//        
//        System.out.println(answer);
		
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] sk = skill.toCharArray();
        
        for(int i = 0; i < skill_trees.length; i++) {
        	System.out.print(skill_trees[i] + " : ");
        	System.out.println(skill_trees[i].replaceAll("[^"+skill+"]", ""));
        	System.out.println(skill.indexOf(skill_trees[i].replaceAll("[^"+skill+"]", "")));
        }
        
        for(int i = 0; i < skill_trees.length; i++) {
        	char[] temp = skill_trees[i].toCharArray();
        	boolean chk = true;
        	for(int j = 0; j < temp.length; j++) {        		   		
        		for(int k = 1; k < sk.length; k++) {
        			if(temp[j] == sk[k]) {
        				for(int l = j; l >= 0; l--) {
        					if(temp[l] == sk[k-1]) {
        						chk = true;
        						break;
        					}
        					chk = false;
        				}
        			}
        			if(!chk) {
        				break;
        			}
        		}
        		if(!chk) {
    				break;
    			}
        	}
        	
        	if(chk) {
        		answer++;
        	}
        	
        	chk = true;
        }
        
        return answer;
    }
}
