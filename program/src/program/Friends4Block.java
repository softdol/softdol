package program;

import java.util.Arrays;

public class Friends4Block {
	/*	
	 * 	���� ����
		������4���
		����ε� ��ä�� ����� ���� ��� ���̾��� �ű� ���� ���� ������ �ð� �Ǿ���. 
		�̹��� ����� ���� ������ "������4���".
		���� ����� īī�������� ����� 2��2 ���·� 4���� �پ����� ��� ������鼭 ������ ��� �����̴�.

		���� ���� ���� ���� �־��� ���, ���̾��� 2��2�� ��ġ�� 7�� ��ϰ� 
		���� 2��2�� ��ġ�� 4�� ����� ��������. 
		���� ����� ���� 2��2�� ���Ե� �� ������, 
		�������� ���ǿ� �����ϴ� 2��2 ����� ���� �� �ִٸ� �Ѳ����� ��������.

		board map

		����� ������ �Ŀ� ���� �ִ� ����� �Ʒ��� ������ �� ������ ä��� �ȴ�.

		board map

		���� �� ������ ä�� �Ŀ� �ٽ� 2��2 ���·� ���� ����� ����� ���̸� �ٽ� �������� �������� �ݺ��ϰ� �ȴ�.
		
		board map

		�� �ʱ� ��ġ�� ���ڷ� ǥ���ϸ� �Ʒ��� ����.

		TTTANT
		RRFACC
		RRRFCC
		TRRRAA
		TTMMMF
		TMMTTJ
		
		�� ���ڴ� ���̾�(R), ����(M), ����ġ(A), ���ε�(F), �׿�(N), Ʃ��(T), ������(J), ��(C)�� �ǹ��Ѵ�

		�Է����� ����� ù ��ġ�� �־����� ��, �������� ����� ��� �� ������ �Ǵ��ϴ� ���α׷��� �����϶�.

		�Է� ����
		�Է����� ���� ���� m, �� n�� ���� ��ġ ���� board�� ���´�.
		2 <= n, m <= 30
		board�� ���� n�� ���ڿ� m���� �迭�� �־�����. ����� ��Ÿ���� ���ڴ� �빮�� A���� Z�� ���ȴ�.
		��� ����
		�Է����� �־��� �� ������ ������ �� ���� ����� �������� ����϶�.

		����� ����
		m	n	board	answer
		4	5	["CCBDE", "AAADE", "AAABF", "CCBBF"]	14
		6	6	["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"]	15
		������ ���� ����
		����� ���� 1�� ���, 
		ù ��°���� A ��� 6���� ��������, 
		�� ��°���� B ��� 4���� C ��� 4���� ������, 
		��� 14���� ����� ��������.
		
		����� ���� 2�� ���� ���� �ִ� �׸��� �ű� ���̴�. 
		11���� 4���� ����� ���ʷ� ��������, 
		��� 15���� ����� ��������.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int m = 4;
		int n = 5;
		String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		
		System.out.println(solution(m, n, board));
		
	}
	
	static char[][] blockList;
	static char[][] delList;
	static int answer;
	
	public static int solution(int m, int n, String[] board) {
        answer = 0;
        
        blockList = new char[m][n];
        delList = new char[m][n];
        for(int k = 0; k < delList.length; k++) {
        	Arrays.fill(delList[k], 'B');
        }
        
        int i = 0, j = 0;
        for(String s : board) {
        	for(char c : s.toCharArray()) {
        		blockList[i][j++] = c;
        	}
        	i++;
        	j = 0;
        }
        
        delBlock();
        
//        boolean chkDel = false;
//        
//        for(i = 0; i < blockList.length; i++) {
//        	for(j = 0; j < blockList[i].length; j++) {
//        		System.out.print(blockList[i][j]);
//        	}
//        	System.out.println();
//        }
//        
//        for(i = 0; i < blockList.length - 1; i++) {
//        	for(j = 0; j < blockList[i].length - 1; j++) {
//        		//System.out.print(blockList[i][j]);
//        		if(blockList[i][j] == blockList[i][j + 1]
//        			&& blockList[i][j] == blockList[i + 1][j + 1]
//        			&& blockList[i][j] == blockList[i + 1][j]){
//        			delList[i][j] = 'D';
//        			delList[i][j + 1] = 'D';
//        			delList[i + 1][j] = 'D';
//        			delList[i + 1][j + 1] = 'D';
//        			chkDel = true;
//        			}
//        	}
//        }
//        
//        System.out.println();
//        
//        for(i = 0; i < delList.length; i++) {
//        	for(j = 0; j < delList[i].length; j++) {
//        		if(delList[i][j] == 'D') {
//        			blockList[i][j] = ' ';
//        			answer++;
//        		}
//        	}
//        }
//                
//        System.out.println();
//        
//        for(i = blockList.length - 1; i >= 0; i--) {
//        	for(j = 0; j < blockList[i].length; j++) {
//        		if(blockList[i][j] == ' ') {
//        			
//        			for(int tempI = i - 1; tempI >= 0; tempI--) {
//        				if(blockList[tempI][j] != ' ') {
//        					//char tempC =
//        					blockList[i][j] = blockList[tempI][j];
//        					blockList[tempI][j] = ' ';
//        					break;
//        				}
//        			}
//        		}
//        	}
//        }
//        
//        for(i = 0; i < blockList.length; i++) {
//        	for(j = 0; j < blockList[i].length; j++) {
//        		System.out.print(blockList[i][j]);
//        	}
//        	System.out.println();
//        }
        
        
        //if(chkDel) {
        	
        //}
        
        return answer;
    }
	
	public static void delBlock() {
		
		boolean chk = false;
		
		for(int k = 0; k < delList.length; k++) {
        	Arrays.fill(delList[k], 'B');
        }
    	
    	for(int i = 0; i < blockList.length - 1; i++) {
        	for(int j = 0; j < blockList[i].length - 1; j++) {
        		//System.out.print(blockList[i][j]);
        		if(blockList[i][j] != ' ') {
            		if(blockList[i][j] == blockList[i][j + 1]
            			&& blockList[i][j] == blockList[i + 1][j + 1]
            			&& blockList[i][j] == blockList[i + 1][j]){
            			delList[i][j] = 'D';
            			delList[i][j + 1] = 'D';
            			delList[i + 1][j] = 'D';
            			delList[i + 1][j + 1] = 'D';
            			chk = true;
            			}
        		}
        	}
        }
    	
    	for(int i = 0; i < delList.length; i++) {
        	for(int j = 0; j < delList[i].length; j++) {
        		if(delList[i][j] == 'D') {
        			blockList[i][j] = ' ';
        			answer++;
        		}
        	}
        }
    	
    	for(int i = blockList.length - 1; i >= 0; i--) {
        	for(int j = 0; j < blockList[i].length; j++) {
        		if(blockList[i][j] == ' ') {
        			
        			for(int tempI = i - 1; tempI >= 0; tempI--) {
        				if(blockList[tempI][j] != ' ') {
        					//char tempC =
        					blockList[i][j] = blockList[tempI][j];
        					blockList[tempI][j] = ' ';
        					break;
        				}
        			}
        		}
        	}
        }
    	
    	if(chk) {
    		delBlock();
    	}
    	
//    	System.out.println();
//    	for(int i = 0; i < blockList.length; i++) {
//        	for(int j = 0; j < blockList[i].length; j++) {
//        		System.out.print(blockList[i][j]);
//        	}
//        	System.out.println();
//        }
    	
	}
}



















